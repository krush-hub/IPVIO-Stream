package com.ipvio.stream

val DictPtO = """
Nachteule¦Coruja da noite
Vampir¦Vampiro
Eisbär¦Urso polar
Tiefsee¦Mar profundo
Waldschrat¦Floresta
Mitternachtssnack¦Lanche da meia-noite
Sonnenbrand¦Queimadura de sol
Eisfach¦Congelador
Waldboden¦Chão da floresta
Glut¦Brasas
Zuschneiden¦Recortar
Live TV + Filme & Serien¦TV ao vivo + filmes e séries
Nur Live TV¦Só TV ao vivo
Nur Filme & Serien¦Só filmes e séries
Es gibt keine {0}. Falls es welche geben sollte, prüfe Einstellungen > Playlists: Der Inhaltsmodus dieser Playlist steht vielleicht auf „{1}“.¦Não há {0}. Se deveria haver, verifique Configurações > Playlists: o modo de conteúdo desta playlist pode estar em „{1}“.
Filme oder Serien¦filmes ou séries
Kategorien ein- und ausblenden¦Mostrar e ocultar categorias
Blende einzelne Kategorien aus oder schalte alle aus und nur die gewünschten wieder ein. Ausgeblendete Kategorien verschwinden sofort überall, ohne die Playlist neu zu laden.¦Oculte categorias individuais ou desligue todas e ligue só as que você quer. As categorias ocultas somem de todos os lugares na hora, sem recarregar a playlist.
Live-TV¦TV ao vivo
Zugangsdaten werden nur auf diesem Gerät gespeichert und hier nicht angezeigt. Es ist immer eine Playlist aktiv. Mit „Zur Hauptliste machen“ wechselst du die Liste.¦Os dados de acesso são salvos só neste aparelho e não são mostrados aqui. Sempre há uma playlist ativa. Use „Tornar lista principal“ para trocar de lista.
Tippe rechts mit der Tastatur. Gesucht wird im Sendernamen und in der Kategorie.¦Digite à direita com o teclado. A busca é feita no nome do canal e na categoria.
Video¦Vídeo
Ton¦Áudio
Video-Rate (laut Datei)¦Taxa de vídeo (segundo o arquivo)
Bilder: {#0} gezeigt · {#1} verworfen¦Quadros: {#0} exibidos · {#1} descartados
übergangen: {0}¦ignorado: {0}
gemerkt: {0}¦salvo: {0}
fertig: {0}¦concluído: {0}
fertig: {0}  → als Nächstes {1}¦concluído: {0}  → a seguir: {1}
Fortsetzen #{0}: Eintrag {1} bei {#2}s → spielt {3}¦Retomar #{0}: item {1} aos {#2}s → reproduz {3}
Fortsetzen #{0}: Eintrag {1} bei {#2}s → Folge nicht gefunden, gespeicherte Adresse¦Retomar #{0}: item {1} aos {#2}s → episódio não encontrado, endereço salvo
Fortsetzen #{0}: Eintrag {1} (nächste) bei {#2}s → spielt {3}¦Retomar #{0}: item {1} (próximo) aos {#2}s → reproduz {3}
Fortsetzen #{0}: Eintrag {1} (nächste) bei {#2}s → Folge nicht gefunden, gespeicherte Adresse¦Retomar #{0}: item {1} (próximo) aos {#2}s → episódio não encontrado, endereço salvo
Das Zertifikat des Anbieters passt nicht zur Server-Adresse. Beim Anbieter nach einer aktuellen Adresse fragen.¦O certificado do provedor não corresponde ao endereço do servidor. Peça um endereço atualizado ao provedor.
Der Server des Anbieters lehnt die Verbindung ab (512). Meist ist die Server-Adresse nicht mehr aktuell oder gesperrt.¦O servidor do provedor recusou a conexão (512). Geralmente o endereço do servidor está desatualizado ou bloqueado.
Der Server des Anbieters lehnt die Verbindung ab (512). Meist ist die Server-Adresse nicht mehr aktuell oder gesperrt. Beim Anbieter nach der aktuellen Adresse fragen.¦O servidor do provedor recusou a conexão (512). Geralmente o endereço do servidor está desatualizado ou bloqueado. Peça o endereço atual ao provedor.
Datei konnte nicht umbenannt werden¦Não foi possível renomear o arquivo
Download unvollständig¦Download incompleto
{0} (evtl. nicht abspielbar)¦{0} (talvez não reproduza)
Setzt nur die Einstellungen dieser Seite auf die Standardwerte zurück. Alle anderen Seiten bleiben unverändert. Um alles auf einmal zurückzusetzen, nutze Einstellungen > Alles zurücksetzen.¦Redefine só as configurações desta página para os valores padrão. Todas as outras páginas ficam como estão. Para redefinir tudo de uma vez, use Configurações > Redefinir tudo.
Kleinere Zeilen zeigen mehr Sender auf einmal, das hilft auf großen Fernsehern. Größere Zeilen lassen sich aus der Ferne leichter lesen.¦Linhas menores mostram mais canais de uma vez, o que ajuda em TVs grandes. Linhas maiores são mais fáceis de ler de longe.
Setzt alle Einstellungen auf die Standardwerte zurück: Ansicht, Design, Menü, Player, Ton, Genres, Live TV und mehr. Playlists, Favoriten, Verlauf, Fortsetzen-Positionen und die PIN der Kindersicherung bleiben erhalten. Den Cache leerst du unter Speicher.¦Redefine todas as configurações para os valores padrão: aparência, design, menu, player, som, gêneros, TV ao vivo e mais. Playlists, favoritos, histórico, posições de retomada e o PIN do controle parental são mantidos. Limpe o cache em Armazenamento.
Nur eine Seite zurücksetzen? Jede Einstellungsseite hat unten ihren eigenen Zurücksetzen-Knopf.¦Redefinir só uma página? Cada página de configurações tem seu próprio botão de redefinir no fim.
Beim Markieren einer Auswahl zeigt die Vorschau sofort die Wirkung, OK übernimmt sie.¦Ao destacar uma opção, a prévia mostra o efeito na hora; OK aplica.
Technische Infos auf der Detailseite¦Informações técnicas na página de detalhes
Liest beim Öffnen eines Titels den Anfang der Datei und zeigt Auflösung, HDR, Tonspuren und Untertitel. Das belegt kurz eine Verbindung zum Anbieter – bei Zugängen mit nur einer Verbindung ausschalten, wenn gleichzeitig etwas anderes läuft.¦Ao abrir um título, lê o início do arquivo e mostra resolução, HDR, faixas de áudio e legendas. Isso usa brevemente uma conexão com o provedor — desligue se sua conta tiver só uma conexão e outra coisa estiver tocando ao mesmo tempo.
"""
