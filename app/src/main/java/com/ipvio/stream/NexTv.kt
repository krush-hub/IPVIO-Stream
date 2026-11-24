package com.ipvio.stream

/**
 * NexTV: servidor fixo da revenda.
 *
 * Preencha [SERVER] com o endereço Xtream da NexTV (ex.: "http://servidor:8080").
 * Enquanto estiver preenchido o app trava neste servidor: a tela de adicionar
 * playlist só aceita usuário/senha NexTV e [PlaylistStore.load] recusa qualquer
 * playlist de outro host (manual, pelo celular, arquivo ou restauração de
 * backup em segundo plano). Vazio = sem trava (comportamento original).
 */
object NexTv {
    const val SERVER = "http://slimplus.online"

    val locked: Boolean get() = SERVER.isNotBlank()

    /** True when [url] points at the NexTV server (or when there is no lock). */
    fun hostAllowed(url: String): Boolean {
        if (!locked) return true
        val want = runCatching { java.net.URI(SERVER).host?.lowercase() }.getOrNull()
            ?: return false
        val got = PlaylistStore.hostOf(url).lowercase()
        if (got.isBlank() || got == "playlist") return false
        return got == want || got.endsWith(".$want")
    }
}
