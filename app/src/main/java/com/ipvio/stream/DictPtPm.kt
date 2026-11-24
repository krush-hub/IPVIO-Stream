package com.ipvio.stream

val DictPtPm = """
Bearbeiten¦Editar
Playlist bearbeiten¦Editar playlist
Inhalt der Playlist¦Conteúdo da playlist
Änderungen gelten erst, wenn du „Übernehmen“ wählst.¦As alterações só valem quando você escolher „Aplicar“.
Wird neu geladen …¦Recarregando …
Zusätzlich angezeigt¦Exibido também
Einstellungen dieser Playlist¦Configurações desta playlist
Gilt für alle Playlists ohne eigenen Plan. Einen eigenen Plan stellst du bei „Bearbeiten“ einer Playlist ein.¦Vale para todas as playlists sem plano próprio. Você define um plano próprio em „Editar“ de uma playlist.
Allgemeine Einstellung¦Configuração geral
Diese Playlist folgt der allgemeinen Einstellung unter „Automatisch aktualisieren“. Eine Playlist, die nicht die Hauptliste ist, wird dann nicht automatisch aktualisiert.¦Esta playlist segue a configuração geral em „Atualizar automaticamente“. Uma playlist que não é a principal não é atualizada automaticamente nesse caso.
Sports Hub¦Sports Hub
Sportarten, Wettbewerbe, Hinweise, Bereiche¦Esportes, competições, avisos, abas
Wähle, was der Sports Hub zeigt. Ausgeschaltete Sportarten und Wettbewerbe erscheinen nicht und werden nicht abgefragt. Die Ergebnisse kommen von ESPN (inoffizielle Quelle).¦Escolha o que o Sports Hub mostra. Esportes e competições desligados não aparecem nem são consultados. Os resultados vêm da ESPN (fonte não oficial).
Live-Ergebnisse¦Resultados ao vivo
Ergebnisse, Tabellen und Spielpläne von ESPN¦Resultados, tabelas e calendários da ESPN
Du schaust nur Fußball? Schalte die anderen Sportarten aus.¦Você só assiste futebol? Desligue os outros esportes.
Später hinzugefügte Wettbewerbe (britische Ligen und Pokale, weitere europäische und Weltwettbewerbe, WNBA, College Basketball, LPGA, DP World Tour) sind zunächst aus. Manche zeigen vielleicht keine Spiele: ihre ESPN-Adressen sind nicht geprüft.¦Competições adicionadas depois (ligas e copas britânicas, outras competições europeias e mundiais, WNBA, basquete universitário, LPGA, DP World Tour) começam desligadas. Algumas podem não mostrar jogos: os endereços da ESPN não foram verificados.
Hinweise¦Avisos
Hinweise bei Spielen deiner Teams¦Avisos de jogos dos seus times
Hinweise bei Anstoß und Toren¦Avisos de início de jogo e de gols
OK springt zum Spiel¦OK vai para o jogo
OK auf dem Hinweis bei Anstoß oder Tor öffnet einen Sender, der das Spiel zeigt¦OK no aviso de início de jogo ou de gol abre um canal que mostra o jogo
OK: Zum Spiel¦OK: ir para o jogo
Sofort¦Imediatamente
Bereiche des Sports Hub¦Abas do Sports Hub
Blende Bereiche aus, die du nicht brauchst. Mindestens ein Bereich bleibt immer.¦Oculte as abas que você não usa. Pelo menos uma aba sempre permanece.
Startbereich¦Aba inicial
DNS-Server¦Servidor DNS
Systemstandard¦Padrão do sistema
Eigene Adresse¦Endereço próprio
Der DNS-Server löst die Adressen der Anbieter und Dienste auf, mit denen die App spricht. Hilft, wenn ein Anbieter beim Provider gesperrt ist, und für mehr Privatsphäre. Antwortet der Server nicht, nutzt die App den DNS des Geräts. Gilt nicht für den Videostream selbst und nicht für ein VPN.¦O servidor DNS resolve os endereços dos provedores e serviços com os quais o app se comunica. Ajuda quando um provedor está bloqueado pelo seu provedor de internet, e dá mais privacidade. Se o servidor não responder, o app usa o DNS do aparelho. Não vale para o stream de vídeo em si nem para VPN.
IP-Adresse oder https://…/dns-query (bis zu 3, mit Leerzeichen getrennt)¦Endereço IP ou https://…/dns-query (até 3, separados por espaço)
Ungültig: eine IP-Adresse wie 1.1.1.1 oder eine https-Adresse eingeben.¦Inválido: digite um endereço IP como 1.1.1.1 ou um endereço https.
DNS speichern¦Salvar DNS
DNS testen¦Testar DNS
Keine Antwort von {0}¦Sem resposta de {0}
OK: example.com → {0}¦OK: example.com → {0}
VPN¦VPN
Verbindet das Gerät über WireGuard mit dem Server deines VPN-Anbieters, auch für den Videostream. Lade bei deinem Anbieter eine WireGuard-Konfigurationsdatei (.conf) herunter und wähle sie hier aus. Der Schlüssel wird verschlüsselt gespeichert und nie angezeigt. Es gibt keinen Kill-Switch: bricht die Verbindung ab, läuft der Verkehr ohne VPN weiter. Ob das VPN auf deinem Gerät läuft, ist nicht geprüft.¦Conecta o aparelho via WireGuard ao servidor do seu provedor de VPN, inclusive para o stream de vídeo. Baixe um arquivo de configuração WireGuard (.conf) do seu provedor e selecione-o aqui. A chave é salva criptografada e nunca é exibida. Não há kill switch: se a conexão cair, o tráfego continua sem VPN. Não foi verificado se a VPN funciona no seu aparelho.
WireGuard-Datei auswählen¦Escolher arquivo WireGuard
Andere Datei auswählen¦Escolher outro arquivo
VPN verbunden¦VPN conectada
Verbinde …¦Conectando …
VPN aus¦VPN desligada
VPN trennen¦Desconectar VPN
VPN verbinden¦Conectar VPN
VPN-Konfiguration löschen¦Excluir configuração de VPN
Konfiguration gespeichert.¦Configuração salva.
Die VPN-Berechtigung wurde nicht erteilt.¦A permissão de VPN não foi concedida.
Verbindung fehlgeschlagen¦Falha na conexão
Keine Konfiguration gespeichert.¦Nenhuma configuração salva.
Die Datei ist leer.¦O arquivo está vazio.
Die Datei ist zu groß für eine WireGuard-Konfiguration.¦O arquivo é grande demais para uma configuração WireGuard.
Das ist keine WireGuard-Konfiguration: Abschnitt [Interface] fehlt.¦Isso não é uma configuração WireGuard: falta a seção [Interface].
Das ist keine WireGuard-Konfiguration: Abschnitt [Peer] fehlt.¦Isso não é uma configuração WireGuard: falta a seção [Peer].
Der PrivateKey fehlt in der Konfiguration.¦Falta a PrivateKey na configuração.
Der Endpoint (Server) fehlt in der Konfiguration.¦Falta o Endpoint (servidor) na configuração.
Die WireGuard-Konfiguration ist ungültig.¦A configuração WireGuard é inválida.
Dieses Gerät hat keinen sicheren Schlüsselspeicher. Die Konfiguration wird nicht gespeichert.¦Este aparelho não tem armazenamento seguro de chaves. A configuração não será salva.
Neu: VPN mit WireGuard (Einstellungen > Allgemein). Datei deines VPN-Anbieters auswählen, verbinden, fertig – auch der Videostream läuft durch das VPN¦Novo: VPN com WireGuard (Configurações > Geral). Escolha o arquivo do seu provedor de VPN, conecte e pronto — o stream de vídeo também passa pela VPN
Neu: eigener DNS-Server (Einstellungen > Allgemein): Cloudflare, Google, Quad9 oder eine eigene Adresse¦Novo: servidor DNS próprio (Configurações > Geral): Cloudflare, Google, Quad9 ou um endereço próprio
Neu: Einstellungen > Sports Hub – wähle deine Sportarten und Wettbewerbe, die Hinweise und die Bereiche des Sports Hub¦Novo: Configurações > Sports Hub — escolha seus esportes e competições, os avisos e as abas do Sports Hub
Sport: bei einem Tor- oder Anstoß-Hinweis springt OK direkt zu einem Sender mit dem Spiel¦Esportes: no aviso de gol ou de início de jogo, OK vai direto para um canal com o jogo
26 weitere Wettbewerbe: englische Ligen und Pokale, Schottland, Niederlande, EM, WM und mehr (zunächst aus)¦Mais 26 competições: ligas e copas inglesas, Escócia, Holanda, Euro, Copa do Mundo e mais (desligadas no início)
Playlists: pro Playlist ein Fenster „Bearbeiten“ mit „Übernehmen“, und ein eigener Aktualisierungsplan für jede Playlist¦Playlists: uma janela „Editar“ com „Aplicar“ para cada playlist, e um plano de atualização próprio para cada playlist
Playlists: „Neu laden“ bei einer Nebenliste lädt im Hintergrund und macht sie nicht mehr zur Hauptliste¦Playlists: „Recarregar“ numa playlist secundária carrega em segundo plano e não a torna mais a lista principal
Schnellerer Start der App¦Inicialização mais rápida do app
Das VPN und die neuen Sport-Wettbewerbe sind noch nicht auf allen Geräten getestet¦A VPN e as novas competições de esportes ainda não foram testadas em todos os aparelhos
Dieser NexTV-Player funktioniert nur mit dem NexTV-Server.¦Este player NexTV só funciona com o servidor NexTV.
"""
