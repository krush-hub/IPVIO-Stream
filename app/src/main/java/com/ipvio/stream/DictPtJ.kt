package com.ipvio.stream

val DictPtJ = """
Zugang wird geprüft …¦Verificando o acesso …
Sender werden geladen …¦Carregando canais …
Filme werden geladen …¦Carregando filmes …
Serien werden geladen …¦Carregando séries …
Serien werden geladen ({#0}/{#1}) …¦Carregando séries ({#0}/{#1}) …
Die Schnittstelle des Anbieters antwortet nicht wie erwartet.¦A interface do provedor não está respondendo como esperado.
Zugang abgelehnt. Benutzername, Passwort oder Abo prüfen.¦Acesso negado. Verifique o nome de usuário, a senha ou a assinatura.
Der Server hat keine gültige Playlist geliefert.¦O servidor não retornou uma playlist válida.
Update verfügbar: Version {0}¦Atualização disponível: versão {0}
Update wird geladen …¦Baixando a atualização …
Installiert: Version {0}¦Instalada: versão {0}
Automatisch nach Updates suchen¦Buscar atualizações automaticamente
Einmal am Tag. Ein neues Update erscheint in der Glocke oben rechts.¦Uma vez por dia. Uma nova atualização aparece no sino no canto superior direito.
Jetzt nach Update suchen¦Buscar atualização agora
Updates kommen von der Projektseite auf GitHub. Deine Playlists, Favoriten, der Verlauf und die Einstellungen bleiben bei einem Update erhalten. Android fragt vor der Installation einmal nach.¦As atualizações vêm da página do projeto no GitHub. Suas playlists, favoritos, histórico e configurações são mantidos na atualização. O Android pergunta uma vez antes de instalar.
Eigene Update-Adresse (leer = GitHub)¦Endereço próprio de atualização (vazio = GitHub)
Noch keine Veröffentlichung gefunden¦Nenhuma versão publicada encontrada ainda
Dieses Stream-Format wird nicht unterstützt.¦Este formato de stream não é suportado.
Verbindung hängt – neuer Versuch ({#0})¦Conexão travada – tentando novamente ({#0})
Verbindung unterbrochen – neuer Versuch ({#0})¦Conexão interrompida – tentando novamente ({#0})
Stream beendet – verbinde neu …¦Stream encerrado – reconectando …
Das Portal hat keine Abspiel-Adresse geliefert. Später erneut versuchen.¦O portal não retornou um endereço de reprodução. Tente novamente mais tarde.
Zu wenig freier Speicher für den Live-Puffer¦Pouco espaço livre para o buffer ao vivo
Zu wenig freier Speicher¦Pouco espaço livre
Aufnahme läuft weiter – dafür braucht dein Anbieter 2 gleichzeitige Verbindungen¦A gravação continua – para isso, seu provedor precisa permitir 2 conexões simultâneas
30 s zurück¦Voltar 30 s
Aufnehmen¦Gravar
Aufnahme beenden¦Parar a gravação
Aufnahme gestartet¦Gravação iniciada
Aufnahme beendet¦Gravação encerrada
Aufnahme läuft¦Gravando
Sender unbekannt¦Canal desconhecido
Aufnahmen ({#0})¦Gravações ({#0})
Zurückspulen und Aufnehmen¦Rebobinar e gravar
Live TV zurückspulen¦Rebobinar a TV ao vivo
Speichert den laufenden Sender auf dem Gerät. Dann kannst du pausieren, ohne etwas zu verpassen, mit den Spultasten zurückspringen und mit „Zurück zu Live“ wieder aufholen. Gilt für normale Live-Streams (nicht HLS).¦Salva o canal atual no aparelho. Assim você pode pausar sem perder nada, voltar com os botões de rebobinar e alcançar o ao vivo com "Voltar ao vivo". Vale para streams ao vivo normais (não HLS).
Puffergröße¦Tamanho do buffer
Ungefähr: 512 MB reichen für 10–20 Minuten in HD. Der Puffer wird beim Schließen des Players gelöscht.¦Aproximadamente: 512 MB duram de 10 a 20 minutos em HD. O buffer é apagado quando o player é fechado.
Speicherort für Aufnahmen¦Local das gravações
Nachlauf nach Sendungsende¦Tempo extra após o fim do programa
Aufnehmen: im Player bei einem Sender auf den roten Knopf. Die laufende Sendung wird bis zu ihrem Ende laut TV-Guide aufgenommen, beginnt sie schon im Puffer, auch von ihrem Anfang an. Schaust du währenddessen einen anderen Sender, braucht das eine zweite Verbindung zu deinem Anbieter. Aufnahmen liegen im App-Ordner und werden beim Deinstallieren der App gelöscht.¦Para gravar: no player, toque no botão vermelho em um canal. O programa atual é gravado até o fim, conforme o guia de TV, e desde o início, se ainda estiver no buffer. Se você assistir a outro canal nesse meio-tempo, é preciso uma segunda conexão com seu provedor. As gravações ficam na pasta do app e são apagadas quando o app é desinstalado.
Noch keine Aufnahmen.¦Ainda não há gravações.
Stoppen¦Parar
Abspielen: Live TV > „Aufnahmen“.¦Para assistir: TV ao vivo > "Gravações".
Interner Speicher¦Armazenamento interno
USB / Speicherkarte {#0}¦USB / cartão de memória {#0}
frei¦livre
Verbindung beendet¦Conexão encerrada
Puffer beendet¦Buffer encerrado
Puffer-Adresse ungültig¦Endereço do buffer inválido
Mit anzeigen¦Mostrar também
Nicht mehr mit anzeigen¦Não mostrar mais
wird mit angezeigt¦também é mostrado
„Mit anzeigen“ zeigt eine Playlist zusätzlich zur aktiven: Filme und Serien erscheinen zusammen (doppelte Filme nur einmal, gleiche Serien als eine Serie mit mehreren Quellen). In Filme und Serien filterst du über „Quelle“, im Live TV wechselst du die Quelle mit dem Knopf oben. Jede weitere Playlist braucht zusätzlich Speicher.¦"Mostrar também" exibe uma playlist além da ativa: filmes e séries aparecem juntos (filmes duplicados só uma vez, a mesma série como uma só série com várias fontes). Em Filmes e Séries, filtre por "Fonte"; na TV ao vivo, troque a fonte com o botão no topo. Cada playlist extra precisa de mais memória.
Weitere Playlist wird geladen: {0}¦Carregando outra playlist: {0}
Zu wenig Speicher für eine weitere Playlist auf diesem Gerät.¦Memória insuficiente para outra playlist neste aparelho.
Kartengröße, Seitenleiste, Raster¦Tamanho dos cartões, barra lateral, grade
Karten¦Cartões
Beim Markieren einer Auswahl zeigt die Vorschau sofort die Wirkung, OK übernimmt sie. Schriftgröße und Farben findest du unter „Design“.¦Ao destacar uma opção, a prévia mostra o efeito na hora; OK aplica. Tamanho da fonte e cores ficam em "Design".
Seitenleiste¦Barra lateral
Position¦Posição
Links¦Esquerda
Rechts¦Direita
Oben¦Em cima
Immer mit Text¦Sempre com texto
Aus: nur Symbole, die Texte erscheinen beim Hineingehen. An: Symbole und Texte sind immer zu sehen (braucht mehr Platz).¦Desligado: só ícones; os textos aparecem ao entrar. Ligado: ícones e textos sempre visíveis (ocupa mais espaço).
Zurück bringt dich jederzeit in die Seitenleiste – auch wenn sie rechts oder oben steht.¦Voltar leva você sempre à barra lateral – mesmo quando ela está à direita ou em cima.
Sport¦Esportes
Jetzt live¦Ao vivo agora
Gleich¦A seguir
Sportsender¦Canais de esportes
Keine Sportsender gefunden¦Nenhum canal de esportes encontrado
Sportsender werden an Kategorie und Namen erkannt (z. B. „Sport“, „DAZN“, „Eurosport“). Sport-Sendungen erscheinen, sobald der TV-Guide geladen ist.¦Canais de esportes são reconhecidos pela categoria e pelo nome (ex.: "Sport", "DAZN", "Eurosport"). Os programas de esportes aparecem assim que o guia de TV é carregado.
TV-Guide wird noch geladen¦O guia de TV ainda está carregando
Stalker-Portal¦Portal Stalker
Portal-Adresse (z. B. http://portal.tld:8080/c/)¦Endereço do portal (ex.: http://portal.tld:8080/c/)
MAC-Adresse (z. B. 00:1A:79:12:34:56)¦Endereço MAC (ex.: 00:1A:79:12:34:56)
Sender und Filme werden geladen (Serien noch nicht). Die MAC-Adresse bekommst du von deinem Anbieter.¦Canais e filmes estão sendo carregados (séries ainda não). Você recebe o endereço MAC do seu provedor.
Angaben unvollständig: Portal-Adresse und MAC-Adresse (z. B. 00:1A:79:12:34:56) nötig.¦Dados incompletos: são necessários o endereço do portal e o endereço MAC (ex.: 00:1A:79:12:34:56).
Das Portal antwortet nicht. Adresse prüfen.¦O portal não responde. Verifique o endereço.
Das Portal lehnt diese MAC-Adresse ab. MAC und Abo beim Anbieter prüfen.¦O portal rejeitou este endereço MAC. Verifique o MAC e a assinatura com seu provedor.
Das Portal hat keine Sender geliefert. MAC-Adresse und Abo beim Anbieter prüfen.¦O portal não retornou nenhum canal. Verifique o endereço MAC e a assinatura com seu provedor.
Filme werden geladen ({#0}) …¦Carregando filmes ({#0}) …
Datei vom Gerät¦Arquivo do aparelho
Auf diesem Gerät gibt es keine Dateiauswahl. Lade die Datei über die Handy-Seite rechts hoch.¦Este aparelho não tem seletor de arquivos. Envie o arquivo pela página do celular à direita.
Das ist keine gültige M3U-Datei.¦Este não é um arquivo M3U válido.
Die Playlist-Datei ist nicht mehr da. Bitte erneut hochladen.¦O arquivo da playlist não está mais aqui. Envie-o novamente.
Playlist wird gelesen …¦Lendo a playlist …
Zugangsdaten eintragen oder eine M3U-Datei hochladen und senden. Die Playlist wird danach automatisch geladen.¦Digite seus dados de acesso ou envie um arquivo M3U. A playlist é carregada automaticamente depois.
Auf ein anderes Gerät übertragen¦Transferir para outro aparelho
Verlauf, Weiterschauen, Favoriten, Listen und Einstellungen mitnehmen – z. B. vom Fire TV auf das Handy. Auf Wunsch auch die Playlists mit Zugangsdaten.¦Leve seu histórico, continuar assistindo, favoritos, listas e configurações – por exemplo, do Fire TV para o celular. Se quiser, também as playlists com os dados de acesso.
Übertragung im WLAN starten¦Iniciar transferência por Wi-Fi
Übertragung beenden¦Encerrar transferência
Das Gerät ist nicht mit einem WLAN verbunden.¦O aparelho não está conectado a uma rede Wi-Fi.
Am Handy (im selben WLAN) öffnen:¦Abra no celular (na mesma Wi-Fi):
Altes Gerät: Sicherung herunterladen. Neues Gerät: hier ebenfalls starten und die Datei einspielen. Danach startet die App neu.¦Aparelho antigo: baixe o backup. Aparelho novo: inicie aqui também e importe o arquivo. Depois, o app reinicia.
Google Drive¦Google Drive
Mit Google verbinden¦Conectar com o Google
Am Handy öffnen und den Code eingeben:¦Abra no celular e digite o código:
Die App speichert nur in ihrem eigenen, versteckten Ordner in deinem Google Drive und sieht sonst nichts.¦O app só salva na sua própria pasta oculta no seu Google Drive e não vê mais nada.
Nicht verbunden (abgelehnt oder Zeit abgelaufen).¦Não conectado (recusado ou tempo esgotado).
Verbunden.¦Conectado.
Letzte Sicherung: {0}¦Último backup: {0}
Playlists mit Zugangsdaten mitsichern¦Incluir playlists com dados de acesso no backup
Praktisch für ein neues Gerät. Die Zugangsdaten liegen dann in deinem Google Drive.¦Prático para um aparelho novo. Seus dados de acesso ficam então no seu Google Drive.
Jetzt in Drive sichern¦Fazer backup no Drive agora
Aus Drive wiederherstellen¦Restaurar do Drive
Trennen¦Desconectar
Sichern …¦Fazendo backup …
Gesichert.¦Backup feito.
Laden …¦Carregando …
In Drive gibt es noch keine Sicherung.¦Ainda não há backup no Drive.
Die Sicherung in Drive ist ungültig.¦O backup no Drive é inválido.
Google antwortet nicht¦O Google não responde
Nicht mit Google verbunden¦Não conectado ao Google
Auf dem Fernseher lässt sich die Zwischenablage oft nicht nutzen: Unter Einstellungen > Speicher > „Übertragung im WLAN starten“ kannst du den Bericht am Handy öffnen (Seite „Letzten Absturzbericht anzeigen“) und dort kopieren.¦Na TV, muitas vezes não dá para usar a área de transferência: em Configurações > Armazenamento > "Iniciar transferência por Wi-Fi", você pode abrir o relatório no celular (página "Mostrar o último relatório de falha") e copiar lá.
Auf dem Handy im Querformat¦Paisagem no celular
Die App ist für den Fernseher gebaut und wirkt quer am besten. Aus: dreht mit dem Gerät. Im Player: Tippen zeigt die Steuerung, Doppeltippen links/rechts spult, in der Mitte Pause.¦O app foi feito para TV e fica melhor na horizontal. Desligado: gira com o aparelho. No player: um toque mostra os controles, toque duplo à esquerda/direita avança ou volta, no meio pausa.
Oder mit der Handy-Kamera scannen¦Ou escaneie com a câmera do celular
QR-Code scannen¦Escanear código QR
Unterstütze NexTV¦Apoie o NexTV
Raster & Ansicht¦Grade e visualização
American Football¦Futebol americano
Basketball¦Basquete
Eishockey¦Hóquei no gelo
Fußball¦Futebol
Tennis¦Tênis
Motorsport¦Automobilismo
Kampfsport¦Esportes de luta
Golf¦Golfe
Handball & Volleyball¦Handebol e vôlei
Rugby & Cricket¦Rugby e críquete
Radsport¦Ciclismo
Wintersport¦Esportes de inverno
Darts & Snooker¦Dardos e sinuca
Nächste 3 Std.¦Próximas 3 h
Morgen¦Amanhã
Keine Sendungen für diese Auswahl¦Nenhum programa para esta seleção
Zusatzbild¦Imagem extra
Anordnung¦Layout
Bild-in-Bild¦Picture-in-picture
Geteilt¦Tela dividida
Ton von¦Som de
Hauptstream¦Stream principal
Streams tauschen¦Trocar streams
Dieser Sender ist beim Anbieter gerade nicht erreichbar. Probiere einen anderen.¦Este canal não está acessível no provedor no momento. Tente outro.
Dein Anbieter erlaubt vermutlich nur eine Verbindung gleichzeitig. Frage nach einem Zugang mit mehr Verbindungen.¦Seu provedor provavelmente permite só uma conexão por vez. Peça um acesso com mais conexões.
Die Verbindung ist zu langsam oder wurde abgelehnt. Ein Sender in niedrigerer Qualität hilft oft.¦A conexão está lenta demais ou foi recusada. Um canal em qualidade menor costuma ajudar.
Dein Gerät schafft zwei Videos gleichzeitig nicht. Wähle für beide Bilder SD-Sender.¦Seu aparelho não dá conta de dois vídeos ao mesmo tempo. Escolha canais SD para as duas imagens.
Probiere einen anderen Sender oder eine niedrigere Qualität.¦Tente outro canal ou uma qualidade menor.
Schon ein anderes Gerät mit NexTV? Spiele die Sicherung ein: Playlists, Zugangsdaten, Verlauf, Favoriten und Einstellungen sind danach sofort da.¦Já tem outro aparelho com NexTV? Restaure o backup: playlists, dados de acesso, histórico, favoritos e configurações ficam disponíveis na hora.
Sicherung von anderem Gerät einspielen¦Restaurar backup de outro aparelho
Keine gültige Sicherung gefunden.¦Nenhum backup válido encontrado.
Auf diesem Gerät gibt es keine Dateiauswahl. Spiele die Sicherung über die Handy-Seite rechts ein.¦Este aparelho não tem seletor de arquivos. Restaure o backup pela página do celular à direita.
Sicherung mit Playlists speichern …¦Salvando backup com playlists …
Auf diesem Gerät gibt es keine Dateiauswahl. Nutze die Übertragung im WLAN.¦Este aparelho não tem seletor de arquivos. Use a transferência por Wi-Fi.
Gesichert werden Einstellungen, Favoriten, Verlauf, Weiterschauen und Profile. Playlists und Zugangsdaten sind nur in „Sicherung mit Playlists“ enthalten (die Datei enthält Passwörter, gib sie nicht weiter). Beim Wiederherstellen startet die App neu. Auf einem neuen Gerät geht das gleich beim Hinzufügen der ersten Playlist.¦O backup inclui configurações, favoritos, histórico, continuar assistindo e perfis. Playlists e dados de acesso só estão em "Salvar backup com playlists" (o arquivo contém senhas, não o compartilhe). Ao restaurar, o app reinicia. Em um aparelho novo, dá para fazer isso ao adicionar a primeira playlist.
Wichtig zu wissen¦Bom saber
NexTV ist nur ein Abspielgerät. Die App liefert selbst keine Sender, Filme, Serien und keine Playlist. Den Link oder die Zugangsdaten bekommst du von deinem IPTV-Anbieter oder aus deiner eigenen Quelle. Wir können dir keinen Link nennen.¦O NexTV é só um player. O app não fornece canais, filmes, séries nem playlist. Você recebe o link ou os dados de acesso do seu provedor de IPTV ou da sua própria fonte. Não podemos indicar nenhum link.
OK = groß¦OK = ampliar
Handy und dieses Gerät müssen im selben WLAN sein. Halte die Kamera auf das Bild. Es klappt auch aus einiger Entfernung.¦O celular e este aparelho precisam estar na mesma Wi-Fi. Aponte a câmera para a imagem. Também funciona a certa distância.
Oder Adresse im Browser eintippen:¦Ou digite o endereço no navegador:
Zurück oder OK schließt das Bild.¦Voltar ou OK fecha a imagem.
Leiste nach unten¦Barra para baixo
Leiste nach oben¦Barra para cima
Texte¦Textos
Immer zeigen¦Mostrar sempre
Nur Symbole¦Só ícones
Beim Markieren¦Ao destacar
Bild¦Imagem
Kartenbreite¦Largura dos cartões
Spalten und Zeilen gelten nur in der Ansicht „Raster“.¦Colunas e linhas só valem na visualização "Grade".
Zeigt die echte App mit deinen Titeln; die Einstellungen erscheinen in einer schmalen Leiste unten. Ein Klick auf eine Auswahl wirkt sofort.¦Mostra o app de verdade com seus títulos; as configurações aparecem em uma barra fina embaixo. Um clique em uma opção aplica na hora.
Zwei gleich groß¦Dois do mesmo tamanho
Einer groß, einer klein¦Um grande, um pequeno
So sieht eine Karte aus: normal und markiert¦É assim que um cartão fica: normal e destacado
Score-Overlay¦Placar na tela
Anzeige¦Exibição
Untereinander¦Um embaixo do outro
Nebeneinander¦Lado a lado
In den Ecken verteilt¦Espalhados pelos cantos
Ausgewählte Spiele entfernen¦Remover jogos selecionados
Zusatzbild nicht abspielbar¦Não foi possível reproduzir a imagem extra
Alle Playlists¦Todas as playlists
Fenstergröße¦Tamanho da janela
Gilt für Bild-in-Bild. Deine Auswahl wird gespeichert.¦Vale para picture-in-picture. Sua escolha é salva.
Handy-Suche¦Busca pelo celular
Der Server konnte nicht gestartet werden.¦Não foi possível iniciar o servidor.
Suche und starte Filme, Serien und Sender am Handy. Handy und Fernseher müssen im selben WLAN sein.¦Busque e inicie filmes, séries e canais pelo celular. O celular e a TV precisam estar na mesma Wi-Fi.
Filme, Serien, Sender suchen …¦Buscar filmes, séries, canais …
Pause / Weiter¦Pausa / Continuar
Leiser¦Volume -
Lauter¦Volume +
Code vom Fernseher:¦Código da TV:
Tippe einen Titel ein.¦Digite um título.
Läuft auf dem Fernseher.¦Tocando na TV.
Fehler. Ist der Fernseher noch an?¦Erro. A TV ainda está ligada?
Es läuft nichts.¦Não está tocando nada.
Die Playlist wird noch geladen.¦A playlist ainda está carregando.
Nichts gefunden.¦Nada encontrado.
Folge¦Episódio
Lädt …¦Carregando …
Stopp¦Parar
Beenden¦Encerrar
Fertige Designs¦Designs prontos
Ein Klick stellt Farbe und Hintergrund passend ein. Darunter kannst du alles weiter von Hand ändern.¦Um clique ajusta cor e fundo combinando. Abaixo, você pode mudar tudo manualmente.
Bildschirm anpassen¦Ajustar tela
Uhr anzeigen¦Mostrar relógio
Zeigt die Uhrzeit oben neben dem Profil-Symbol.¦Mostra a hora em cima, ao lado do ícone de perfil.
Rand links und rechts¦Margem esquerda e direita
Rand oben und unten¦Margem superior e inferior
Wenn am Fernseher Menü oder Texte am Rand abgeschnitten werden, stelle hier einen Rand ein. Der Hintergrund bleibt vollflächig, der Player nutzt immer den ganzen Bildschirm.¦Se o menu ou os textos forem cortados na borda da TV, ajuste uma margem aqui. O fundo continua em tela cheia e o player sempre usa a tela inteira.
Leer¦Espaço
Löschen¦Excluir
Alles¦Tudo
Gestern¦Ontem
Heute¦Hoje
Beendet¦Finalizado
Auf¦Em
Nicht in deinen Sendern¦Não está nos seus canais
Kein Sender in deiner Liste gefunden¦Nenhum canal encontrado na sua lista
Live-Ergebnisse: An¦Resultados ao vivo: Ligado
Live-Ergebnisse: Aus¦Resultados ao vivo: Desligado
Jetzt live auf deinen Sendern¦Ao vivo agora nos seus canais
Ergebnisse werden geladen …¦Carregando resultados …
Ergebnisse gerade nicht erreichbar – es werden nur Playlist und TV-Guide gezeigt.¦Resultados indisponíveis no momento – só playlist e guia de TV são mostrados.
Filme¦Filmes
Dokumentationen¦Documentários
Kinder¦Infantil
Nachrichten¦Notícias
Musik¦Música
Start¦Início
Zuletzt gesehen¦Vistos recentemente
noch¦restam
▲▼ Sender  ·  OK Steuerung  ·  OK halten: mehr¦▲▼ Canais  ·  OK Controles  ·  segure OK: mais
Meine Teams¦Meus times
Teams merken¦Salvar times
OK auf einem Team merkt es oder entfernt es wieder. Es erscheinen die Teams der Spiele des gewählten Tages.¦OK em um time o salva ou o remove. Aparecem os times dos jogos do dia escolhido.
Hinweise: An¦Avisos: Ligado
Hinweise: Aus¦Avisos: Desligado
Verzögerung¦Atraso
Dein Team spielt gleich¦Seu time joga já já
Dein Team spielt jetzt¦Seu time está jogando agora
Punkte!¦Ponto!
Mini-Spielstand¦Miniplacar
Ein kleines Fenster in der Ecke zeigt den Stand, solange eines deiner Teams spielt – auch beim Film oder auf einem anderen Sender.¦Uma janelinha no canto mostra o placar enquanto um dos seus times joga – mesmo durante um filme ou em outro canal.
Fenster: An¦Janela: Ligada
Fenster: Aus¦Janela: Desligada
Größe¦Tamanho
Oben links¦Canto superior esquerdo
Oben rechts¦Canto superior direito
Unten links¦Canto inferior esquerdo
Unten rechts¦Canto inferior direito
Klein¦Pequeno
Normal¦Normal
Groß¦Grande
Logos und Namen¦Logos e nomes
Nur Logos¦Só logos
Spielzeit: An¦Tempo de jogo: Ligado
Spielzeit: Aus¦Tempo de jogo: Desligado
Sender korrigieren¦Corrigir canal
Zurücksetzen (automatisch)¦Redefinir (automático)
Kein Sender gefunden. Lange drücken zum Korrigieren.¦Nenhum canal encontrado. Pressione e segure para corrigir.
Tabelle¦Tabela
Schließen¦Fechar
Keine Tabelle verfügbar.¦Nenhuma tabela disponível.
Lade…¦Carregando…
Ausgeblendete¦Ocultos
Alle wieder einblenden¦Mostrar todos novamente
Kategorie ausblenden¦Ocultar categoria
Gruppen ignorieren¦Ignorar grupos
Alle wieder einschalten¦Ligar todos novamente
Ignoriert¦Ignorados
Titel und Sender sind nach der Kennung deines Anbieters gebündelt (z. B. „TR |“, „[EN]“, „AR:“). Schalte Bündel aus, die du nicht brauchst: Sie verschwinden sofort überall, ohne die Playlist neu zu laden. Ausgeschaltet heißt ignoriert. Hilft dort, wo der Sprachfilter eine Kennung nicht erkennt.¦Títulos e canais são agrupados pela etiqueta do seu provedor (ex.: "TR |", "[EN]", "AR:"). Desligue os grupos que você não precisa: eles somem na hora, em todo lugar, sem recarregar a playlist. Desligado significa ignorado. Ajuda onde o filtro de idioma não reconhece uma etiqueta.
Kalender¦Calendário
Ligen¦Ligas
Abgewählte Ligen erscheinen nicht und werden nicht abgefragt.¦Ligas desmarcadas não aparecem e não são consultadas.
Live-Ergebnisse sind aus. Schalte sie oben ein, dann erscheint der Kalender.¦Os resultados ao vivo estão desligados. Ligue-os acima e o calendário aparece.
Du hast noch keine Teams gemerkt. Unter „Meine Teams“ kannst du Teams merken.¦Você ainda não salvou nenhum time. Em "Meus times", você pode salvar times.
Kalender wird geladen …¦Carregando calendário …
In den nächsten 7 Tagen spielt keines deiner Teams.¦Nenhum dos seus times joga nos próximos 7 dias.
Spiele deiner Teams in den nächsten 7 Tagen¦Jogos dos seus times nos próximos 7 dias
Sicherung speichern unter …¦Salvar backup como …
Sicherung aus Datei laden …¦Carregar backup de arquivo …
Sicherung gespeichert.¦Backup salvo.
Auf diesem Gerät gibt es keine Dateiauswahl. Nutze „Sicherung erstellen“.¦Este aparelho não tem seletor de arquivos. Use "Criar backup".
Auf diesem Gerät gibt es keine Dateiauswahl.¦Este aparelho não tem seletor de arquivos.
„Speichern unter“ lässt dich den Ort wählen, zum Beispiel Google Drive, Downloads oder einen USB-Stick – so nimmst du die Sicherung auf ein anderes Gerät mit.¦"Salvar como" deixa você escolher o local, por exemplo Google Drive, Downloads ou um pendrive – assim você leva o backup para outro aparelho.
Rot¦Vermelho
Blau¦Azul
Dünn¦Fino
Dick¦Grosso
Extra dick¦Extra grosso
Was möchtest du sehen?¦O que você quer assistir?
Die Inhalte werden geladen …¦Carregando conteúdo …
Hier gibt es noch nichts zu sehen. Bitte lass den Bildschirm einrichten.¦Ainda não há nada para assistir aqui. Peça para alguém configurar esta tela.
Zum Beenden weiter halten …¦Continue segurando para sair …
Boomer Mode beenden¦Sair do Modo Boomer
Gib die PIN ein.¦Digite o PIN.
Dieser Sender ist gerade nicht verfügbar¦Este canal não está disponível no momento
Du kommst gleich wieder zur Auswahl.¦Você volta para a seleção em instantes.
So sieht es aus¦É assim que fica
Der Boomer Mode ist mit deiner Kindersicherungs-PIN geschützt.¦O Modo Boomer é protegido pelo seu PIN de controle parental.
Für den Boomer Mode brauchst du eine 4-stellige PIN. Sie schützt auch die Kindersicherung.¦Para o Modo Boomer, você precisa de um PIN de 4 dígitos. Ele também protege o controle parental.
Eine ganz einfache Oberfläche für Eltern und Großeltern: große Kacheln mit Bild, kein Menü, keine Suche, keine Einstellungen. Du stellst hier alles ein, die Person davor muss nur noch auswählen.¦Uma tela bem simples para pais e avós: blocos grandes com imagem, sem menu, sem busca, sem configurações. Você configura tudo aqui; a pessoa na frente da TV só precisa escolher.
Boomer Mode jetzt starten¦Iniciar Modo Boomer agora
Die App wechselt sofort zur einfachen Oberfläche. Stelle vorher alles ein. Zurück zur normalen App: Zurück-Taste 10 Sekunden halten, dann PIN.¦O app muda na hora para a tela simples. Configure tudo antes. Para voltar ao app normal: segure o botão Voltar por 10 segundos e digite o PIN.
Automatischer Start nach dem Einschalten: bereit¦Início automático ao ligar: pronto
Automatischer Start: Berechtigung „Über anderen Apps einblenden“ fehlt¦Início automático: falta a permissão "Exibir sobre outros apps"
Im Boomer Mode öffnet sich NexTV von selbst, sobald der Fernseher oder die Box eingeschaltet wird. Manche Geräte (z. B. einzelne Fire-TV-Modelle) blockieren das trotzdem.¦No Modo Boomer, o NexTV abre sozinho assim que a TV ou o aparelho é ligado. Alguns aparelhos (ex.: certos modelos de Fire TV) bloqueiam isso mesmo assim.
Was der Bildschirm zeigt¦O que a tela mostra
Schalte Reihen ein oder aus und schiebe sie mit „Hoch“ und „Runter“. Reihen ohne Inhalt bleiben automatisch versteckt.¦Ligue ou desligue as fileiras e mova-as com "Para cima" e "Para baixo". Fileiras sem conteúdo ficam ocultas automaticamente.
Sender auswählen¦Escolher canais
Wähle aus deiner ganzen Senderliste mit Logos die Sender, die in der Reihe „Meine Sender“ erscheinen. Ohne Auswahl zeigt der Modus deine Live-Favoriten.¦Escolha, da sua lista completa de canais com logos, os canais que aparecem na fileira "Meus canais". Sem seleção, o modo mostra seus favoritos ao vivo.
Sender auswählen …¦Escolher canais …
Auswahl löschen¦Limpar seleção
Filme und Serien auswählen¦Escolher filmes e séries
Wähle Filme und Serien aus, die in der Reihe „Meine Filme und Serien“ erscheinen. Ein Film startet sofort, bei einer Serie öffnet sich die Folgenliste.¦Escolha os filmes e séries que aparecem na fileira "Meus filmes e séries". Um filme começa na hora; numa série, abre a lista de episódios.
Filme und Serien auswählen …¦Escolher filmes e séries …
Ausgewählt¦Selecionado
Aussehen¦Aparência
Größe der Kacheln¦Tamanho dos blocos
Größe der Schrift¦Tamanho da fonte
Markierung: Farbe des Rahmens¦Destaque: cor da borda
Markierung: Dicke des Rahmens¦Destaque: espessura da borda
Zusätzliche helle Innenlinie¦Linha interna clara extra
Macht die Markierung noch deutlicher, auch bei Farbschwäche.¦Deixa o destaque ainda mais claro, também para quem tem daltonismo.
Die markierte Kachel wird leicht größer. Ausschalten = alles bleibt ruhig.¦O bloco destacado fica um pouco maior. Desligar = tudo fica parado.
Logos und Bilder zeigen¦Mostrar logos e imagens
Aus = nur der Name in großer Schrift.¦Desligado = só o nome em letras grandes.
So kommst du wieder heraus¦Como sair daqui
Zurück-Taste 10 Sekunden gedrückt halten, dann die PIN eingeben. Am Handy: die Überschrift „Was möchtest du sehen?“ lange berühren.¦Segure o botão Voltar por 10 segundos e digite o PIN. No celular: toque e segure o título "O que você quer assistir?".
Gerade automatisch: deine Live-Favoriten. Sobald du eine Kachel unten mit OK wählst oder Sender auswählst, stellst du die Reihe selbst zusammen.¦No momento, automático: seus favoritos ao vivo. Assim que você escolher um bloco abaixo com OK ou escolher canais, você monta a fileira.
Du hast die Sender selbst zusammengestellt. OK auf einer Kachel: nach links oder rechts schieben, oder entfernen.¦Você montou os canais. OK em um bloco: move para a esquerda ou para a direita, ou remove.
Aus Favoriten übernehmen¦Importar dos favoritos
Zuletzt gesehene dazu¦Adicionar vistos recentemente
Aus Senderliste …¦Da lista de canais …
Noch keine Sender. Wähle oben Sender aus oder markiere sie in Live TV mit dem Stern.¦Ainda não há canais. Escolha canais acima ou marque-os com a estrela na TV ao vivo.
Nach links schieben¦Mover para a esquerda
Nach rechts schieben¦Mover para a direita
OK wählt aus oder nimmt wieder heraus¦OK seleciona ou remove
Ausgewählte¦Selecionados
Noch nichts ausgewählt.¦Nada selecionado ainda.
Hier gibt es nichts.¦Não há nada aqui.
Große Slideshow¦Slideshow grande
Großes Bild oben mit aktuellen Filmen und Serien¦Imagem grande em cima com filmes e séries atuais
Live TV, Filme, Serien, Favoriten und Meine Liste¦TV ao vivo, filmes, séries, favoritos e Minha lista
Uhr und Datum¦Relógio e data
Große Uhr mit dem heutigen Datum¦Relógio grande com a data de hoje
Dort weitermachen, wo du aufgehört hast¦Continue de onde você parou
Meine Sender¦Meus canais
Deine Live-Favoriten als Reihe¦Seus favoritos ao vivo em uma fileira
Live TV gerade¦TV ao vivo agora
Was jetzt auf deinen Sendern läuft¦O que está passando nos seus canais agora
Die beliebtesten Titel des Tages¦Os títulos mais populares do dia
Weil du etwas geschaut hast¦Porque você assistiu algo
Ähnliche Titel zu deinem letzten Film oder deiner letzten Serie¦Títulos parecidos com seu último filme ou sua última série
Titel, die du dir gemerkt hast¦Títulos que você salvou
Alles, was du zuletzt gestartet hast¦Tudo que você começou recentemente
Neue Filme¦Filmes novos
Zuletzt hinzugefügte Filme¦Filmes adicionados recentemente
Beste Filme¦Melhores filmes
Die am besten bewerteten Filme¦Os filmes mais bem avaliados
Neue Serien¦Séries novas
Zuletzt hinzugefügte Serien¦Séries adicionadas recentemente
Beste Serien¦Melhores séries
Die am besten bewerteten Serien¦As séries mais bem avaliadas
Serien nach Genre¦Séries por gênero
Reihen für die häufigsten Serien-Genres¦Fileiras com os gêneros de séries mais comuns
Filme nach Genre¦Filmes por gênero
Reihen für die häufigsten Film-Genres¦Fileiras com os gêneros de filmes mais comuns
Große Uhr¦Relógio grande
Uhrzeit und Datum, gut lesbar¦Hora e data, bem legíveis
Die Sender, die du ausgewählt hast (sonst die Live-Favoriten)¦Os canais que você escolheu (senão, os favoritos ao vivo)
Filme und Serien dort fortsetzen, wo es aufgehört hat¦Continue filmes e séries de onde pararam
Meine Filme und Serien¦Meus filmes e séries
Die Filme und Serien, die du ausgewählt hast¦Os filmes e séries que você escolheu
Titel aus der Merkliste¦Títulos da lista para assistir
Was zuletzt gestartet wurde¦O que foi começado recentemente
Gezeigt¦Exibido
Versteckt¦Oculto
Hoch¦Para cima
Runter¦Para baixo
Auf Standard zurücksetzen¦Restaurar padrão
Baue dir deine Startseite: Schalte Reihen und Widgets ein oder aus und schiebe sie mit „Hoch“ und „Runter“ an die Stelle, die du möchtest. Die Änderung gilt sofort, schau danach auf der Startseite nach.¦Monte sua tela inicial: ligue ou desligue fileiras e widgets e mova-os com "Para cima" e "Para baixo" para onde quiser. A mudança vale na hora; depois, confira na tela inicial.
Startseite anpassen¦Personalizar tela inicial
Reihen und Widgets wählen und ordnen¦Escolher e ordenar fileiras e widgets
Ganz einfach: große Kacheln zum Auswählen¦Bem simples: blocos grandes para escolher
Spende¦Doação
Hallo, ich bin der nigerianische Prinz und brauche dringend deine Hilfe! Spaß beiseite: Die App kostet dich nichts, mich aber ein paar Nächte Schlaf und sehr viel Kaffee. Wenn du mir ein paar Euro schicken möchtest, tanzt mein Kontostand vor Freude. Kein Zwang: Die App bleibt kostenlos, werbefrei und GPL-lizenziert.¦Olá, eu sou o príncipe nigeriano e preciso urgentemente da sua ajuda! Brincadeira à parte: o app não custa nada para você, mas me custou algumas noites de sono e MUITO café. Se quiser me mandar alguns euros, minha conta bancária vai dançar de alegria. Sem pressão: o app continua gratuito, sem anúncios e com licença GPL.
Mit der Handy-Kamera scannen¦Escaneie com a câmera do celular
Folgen werden geladen …¦Carregando episódios …
Die Folgen konnten nicht geladen werden. Verbindung oder Zugang prüfen.¦Não foi possível carregar os episódios. Verifique a conexão ou o acesso.
Dieser QR-Code ist der PayPal-Link für meine Spende. Mit der Handy-Kamera scannen, dann öffnet sich PayPal.¦Este código QR é o link do PayPal para a minha doação. Escaneie com a câmera do celular e o PayPal abre.
Übersicht¦Visão geral
Spielplan¦Calendário de jogos
Teams¦Times
Top-Spiel¦Jogo principal
Demnächst¦Em breve
Beliebte Ligen¦Ligas populares
Sportarten¦Esportes
Verschoben¦Adiado
Abgesagt¦Cancelado
Statistik¦Estatísticas
Aufstellung¦Escalações
Ereignisse¦Eventos
Kommentar¦Comentários
Bank¦Banco
Tore¦Gols
Zuschauer¦Público
Sender starten¦Iniciar canal
▶ Auf deinen Sendern¦▶ Nos seus canais
Lade Spiele …¦Carregando jogos …
Heute keine Spiele gefunden.¦Nenhum jogo encontrado hoje.
Keine Spiele für diese Auswahl.¦Nenhum jogo para esta seleção.
Dieser Bereich folgt im nächsten Schritt.¦Esta seção vem no próximo passo.
Lade Details …¦Carregando detalhes …
Keine Details verfügbar.¦Nenhum detalhe disponível.
Keine Liga aktiv.¦Nenhuma liga ativa.
Lade Tabelle …¦Carregando tabela …
Für diese Liga gibt es keine Tabelle.¦Não há tabela para esta liga.
Lade Teams …¦Carregando times …
Keine Teams gefunden.¦Nenhum time encontrado.
Nächste Spiele¦Próximos jogos
Letzte Spiele¦Últimos jogos
Nächstes Spiel¦Próximo jogo
Letztes Spiel¦Último jogo
Kader¦Elenco
Trainer¦Treinador
Spiele¦Jogos
Team merken¦Salvar time
Nicht mehr merken¦Remover dos salvos
Meine Ligen¦Minhas ligas
Meine Sportarten¦Meus esportes
Heute für dich¦Hoje para você
Heute keine Spiele deiner Favoriten.¦Hoje não há jogos dos seus favoritos.
Noch keine Teams gemerkt. Im Team Center gibt es „Team merken“.¦Ainda nenhum time salvo. No Centro de Times, há "Salvar time".
Design und Farbe¦Design e cor
Berechtigung erteilt. Der Autostart ist bereit.¦Permissão concedida. O início automático está pronto.
Berechtigung fehlt noch. Bitte „Einstellung öffnen“ wählen und NexTV erlauben.¦Ainda falta a permissão. Escolha "Abrir configuração" e permita o NexTV.
Hauptliste¦Lista principal
zusätzlich angezeigt¦também exibido
Nicht mehr zusätzlich anzeigen¦Não exibir mais também
Zusätzlich anzeigen¦Exibir também
Zur Hauptliste machen¦Tornar lista principal
Die Hauptliste ist die Playlist, mit der die App arbeitet. „Zusätzlich anzeigen“ blendet eine weitere Playlist dazu ein; sie ersetzt die Hauptliste nicht.¦A lista principal é a playlist com a qual o app trabalha. "Exibir também" adiciona outra playlist junto; ela não substitui a lista principal.
Sender suchen¦Buscar canais
Sendername eingeben¦Digite o nome do canal
Keine Treffer¦Nenhum resultado
OK auf dem Feld öffnet die Tastatur. Gesucht wird im Sendernamen und in der Kategorie.¦OK no campo abre o teclado. A busca é feita no nome do canal e na categoria.
Im TV-Guide suchen¦Buscar no guia de TV
Sender oder Sendung¦Canal ou programa
Suche¦Buscar
Mit dem Handy suchen¦Buscar pelo celular
Handy¦Celular
Zuletzt gesucht (OK lange gedrückt = Eintrag entfernen)¦Buscas recentes (segurar OK = remover item)
Zuletzt gesucht¦Buscas recentes
Suche nach einem Titel: hier erscheinen Beschreibung, Bewertung und Format des markierten Treffers.¦Busque um título: aqui aparecem a descrição, a avaliação e o formato do resultado destacado.
SportsHub¦Sports Hub
Sports Hub öffnen¦Abrir Sports Hub
Alle¦Todos
Sender-Qualitäten bündeln¦Agrupar qualidades dos canais
Derselbe Sender in 8K, 4K, FHD, HD und SD erscheint als eine Zeile. OK startet die beste Qualität, die anderen wählst du im Menü des Senders (OK gedrückt halten).¦O mesmo canal em 8K, 4K, FHD, HD e SD aparece como uma só linha. OK inicia a melhor qualidade; as outras você escolhe no menu do canal (segure OK).
Qualität¦Qualidade
Sprache¦Idioma
Ohne Kennung¦Sem identificação
Rand: „Schatten“ legt einen weichen dunklen Schatten unter die Schrift, „Kontur“ zeichnet einen schwarzen Rand rundherum (besser lesbar auf hellem Bild), „Kein“ lässt die Schrift pur.¦Borda: "Sombra" coloca uma sombra escura e suave sob o texto, "Contorno" desenha uma borda preta ao redor (mais legível sobre imagem clara), "Nenhuma" deixa o texto puro.
Bildschirmrand einstellen¦Ajustar borda da tela
Zeigt einen Rahmen mit vier Ecken am Fernseher: Stelle den Rand ein, bis alle vier Ecken sichtbar sind. Hilft, wenn dein Fernseher Menü oder Texte am Rand abschneidet.¦Mostra uma moldura com quatro cantos na TV: ajuste a margem até os quatro cantos ficarem visíveis. Ajuda quando sua TV corta o menu ou os textos na borda.
Du siehst einen weißen Rahmen mit vier grünen Punkten. Wenn eine Ecke fehlt, schneidet dein Fernseher den Rand ab. Rechts/Links ändert den Rand seitlich, Hoch/Runter oben und unten, bis alle vier Ecken sichtbar sind. OK speichert.¦Você vê uma moldura branca com quatro pontos verdes. Se faltar um canto, sua TV está cortando a borda. Direita/Esquerda muda a margem lateral, Cima/Baixo a superior e a inferior, até os quatro cantos ficarem visíveis. OK salva.
Seitlich¦Laterais
Oben/unten¦Em cima/embaixo
Karten: So sehen einzelne Filme und Serien in den Listen aus (Poster oder breites Bild, Größe, Infos).¦Cartões: é assim que filmes e séries aparecem nas listas (pôster ou imagem larga, tamanho, informações).
Seitenleiste: Das Menü am Rand mit Startseite, Filme, Serien und Live TV. Du kannst sie links, rechts oder oben anzeigen.¦Barra lateral: o menu na borda com Tela inicial, Filmes, Séries e TV ao vivo. Você pode exibi-la à esquerda, à direita ou em cima.
Raster & Ansicht: Wie viele Titel nebeneinander erscheinen und ob Details zum markierten Titel gezeigt werden.¦Grade e visualização: quantos títulos aparecem lado a lado e se os detalhes do título destacado são mostrados.
Startseite: Aussehen der ersten Seite nach dem Start. Welche Reihen erscheinen, stellst du über „Startseite anpassen“ ein.¦Tela inicial: a aparência da primeira página após abrir o app. Quais fileiras aparecem, você define em "Personalizar tela inicial".
Kategorien: Die Ordner deines Anbieters oder automatische Genres und ihre Darstellung.¦Categorias: as pastas do seu provedor ou gêneros automáticos e como são exibidos.
Wiedergabe¦Reprodução
Intro und nächste Folge¦Intro e próximo episódio
Uhr im Bild¦Relógio na tela
Netzwerk und Bildrate¦Rede e taxa de quadros
Liste importiert¦Lista importada
Titel gelesen¦títulos lidos
in deiner Playlist gefunden¦encontrados na sua playlist
Mehrfachansicht¦Visualização múltipla
Vier gleich groß¦Quatro do mesmo tamanho
Einer groß, drei klein¦Um grande, três pequenos
OK = Ton hierher, OK lange = Sender wechseln¦OK = som aqui, OK longo = trocar de canal
So sieht die Reihenfolge aus¦É assim que fica a ordem
Nichts gezeigt¦Nada exibido
Listen importieren¦Importar listas
Letterboxd, MyAnimeList, Trakt¦Letterboxd, MyAnimeList, Trakt
Hole deine Listen von Letterboxd, MyAnimeList oder Trakt in die App. Die Titel werden mit deiner Playlist abgeglichen: Merkliste und Gesehen werden übernommen.¦Traga suas listas do Letterboxd, MyAnimeList ou Trakt para o app. Os títulos são comparados com sua playlist: a lista para assistir e os assistidos são importados.
Letterboxd: ZIP oder CSV · MyAnimeList: XML · Trakt: JSON¦Letterboxd: ZIP ou CSV · MyAnimeList: XML · Trakt: JSON
Dieses Gerät hat keinen sicheren Schlüsselspeicher: Playlist-Adressen mit Zugangsdaten werden unverschlüsselt gespeichert.¦Este aparelho não tem armazenamento seguro de chaves: endereços de playlist com dados de acesso são salvos sem criptografia.
Datei vom Gerät wählen¦Escolher arquivo do aparelho
Auf diesem Gerät gibt es keine Dateiauswahl. Nutze den Import im WLAN.¦Este aparelho não tem seletor de arquivos. Use a importação por Wi-Fi.
Import im WLAN starten¦Iniciar importação por Wi-Fi
Import beenden¦Encerrar importação
Am Handy „Liste importieren“ wählen, den Code eingeben und die Exportdatei hochladen.¦No celular, escolha "Importar lista", digite o código e envie o arquivo exportado.
Direkt auf der Startseite bearbeiten¦Editar direto na tela inicial
Öffnet die echte Startseite mit deinen Titeln. Über jeder Reihe erscheint eine Leiste zum Verschieben und Ein- oder Ausblenden.¦Abre a tela inicial de verdade com seus títulos. Acima de cada fileira aparece uma barra para mover ou mostrar/ocultar.
Oder hier in der Liste: Schalte Reihen und Widgets ein oder aus und schiebe sie mit „Hoch“ und „Runter“ an die Stelle, die du möchtest. Die Änderung gilt sofort.¦Ou aqui na lista: ligue ou desligue fileiras e widgets e mova-os com "Para cima" e "Para baixo" para onde quiser. A mudança vale na hora.
Immer oben¦Sempre em cima
Ausblenden¦Ocultar
Einblenden¦Exibir
Fertig¦Pronto
Bearbeiten: Über jeder Reihe kannst du sie verschieben oder ausblenden.¦Editando: acima de cada fileira, você pode movê-la ou ocultá-la.
Auf der echten Startseite ansehen¦Ver na tela inicial de verdade
Live-Vorschau¦Prévia ao vivo
Eine Auswahl wirkt sofort, ohne OK.¦Uma escolha vale na hora, sem OK.
Weiter nach unten wechselt den Bereich, die App dahinter springt mit.¦Descer mais troca de seção e o app atrás acompanha.
Raster: Wie viele Spalten und Zeilen die Rasteransicht (zum Beispiel „Alle Filme“) zeigt.¦Grade: quantas colunas e linhas a visualização em grade (por exemplo, "Todos os filmes") mostra.
Score-Overlay: An¦Placar na tela: Ligado
Score-Overlay: Aus¦Placar na tela: Desligado
Setzt Ansicht, Menü, Player, Ton und Start auf die Standardwerte. Playlists, Favoriten und Verlauf bleiben erhalten. Das Design hat einen eigenen Knopf.¦Restaura visualização, menu, player, som e início para os valores padrão. Playlists, favoritos e histórico são mantidos. O design tem um botão próprio.
Live-Vorschau starten¦Iniciar prévia ao vivo
Zeigt die echte App mit deinen Titeln; unten erscheinen die Einstellungen. Jede Auswahl wirkt sofort, ohne OK.¦Mostra o app de verdade com seus títulos; embaixo aparecem as configurações. Cada escolha vale na hora, sem OK.
Letterboxd · Gesehen¦Letterboxd · Assistidos
Letterboxd · Merkliste¦Letterboxd · Lista para assistir
Trakt · Gesehen¦Trakt · Assistidos
Trakt · Merkliste¦Trakt · Lista para assistir
MyAnimeList · Gesehen¦MyAnimeList · Assistidos
MyAnimeList · Merkliste¦MyAnimeList · Lista para assistir
1 Spiel¦1 jogo
{#0} Spiele¦{#0} jogos
Spiel¦Jogo
Formel 1¦Fórmula 1
1. Training¦Treino 1
2. Training¦Treino 2
3. Training¦Treino 3
Qualifying¦Classificação
Sprint-Qualifying¦Classificação sprint
Sprint¦Sprint
Rennen¦Corrida
Aktuelle Position¦Posição atual
Alle Ligen¦Todas as ligas
Alle Wettbewerbe¦Todas as competições
Als Favorit merken¦Adicionar aos favoritos
Favorit¦Favorito
Anderen Sender wählen¦Escolher outro canal
Sender zuordnen¦Atribuir canal
Automatisch zuordnen¦Atribuir automaticamente
Auf deinen Sendern¦Nos seus canais
Live ansehen¦Assistir ao vivo
Kein passender Sender gefunden¦Nenhum canal compatível encontrado
ESPN liefert keine Streams. Gesucht wird in deinem TV-Guide und in deinen Sendernamen. Du kannst den Sender auch selbst zuordnen; die App merkt sich das für dieses Spiel.¦A ESPN não fornece streams. A busca é feita no seu guia de TV e nos nomes dos seus canais. Você também pode atribuir o canal; o app lembra disso para este jogo.
Von dir zugeordnet¦Atribuído por você
Laut TV-Guide¦Segundo o guia de TV
Sendername passt¦Nome do canal confere
Verfügbar¦Disponível
Keine Sender in der Playlist.¦Nenhum canal na playlist.
Match Center¦Centro de Partidas
Daten konnten nicht geladen werden¦Não foi possível carregar os dados
Die Daten konnten nicht geladen werden. Bitte versuche es erneut.¦Não foi possível carregar os dados. Tente novamente.
ESPN antwortet gerade nicht. Bitte versuche es erneut.¦A ESPN não está respondendo no momento. Tente novamente.
ESPN antwortet gerade nicht. Prüfe die Internetverbindung und versuche es erneut.¦A ESPN não está respondendo no momento. Verifique a conexão com a internet e tente novamente.
ESPN hat für dieses Team gerade keine Daten geliefert.¦A ESPN não enviou dados para este time no momento.
ESPN liefert für diesen Spieler keine Daten.¦A ESPN não fornece dados para este jogador.
Keine Spielerdaten¦Sem dados do jogador
Ergebnisse von heute¦Resultados de hoje
Ergebnisse¦Resultados
Letzte Ergebnisse¦Últimos resultados
Keine Ergebnisse¦Sem resultados
Noch keine Ergebnisse¦Ainda sem resultados
Live-Ergebnisse sind aus¦Resultados ao vivo estão desligados
Ergebnisse, Tabellen und Spielpläne kommen von ESPN (inoffizielle Quelle). Schalte sie ein, um den Sports Hub zu nutzen.¦Resultados, tabelas e calendários vêm da ESPN (fonte não oficial). Ligue-os para usar o Sports Hub.
Einschalten¦Ligar
Gerade läuft nichts¦Nada ao vivo no momento
Sobald ein Spiel deiner Ligen beginnt, erscheint es hier.¦Assim que um jogo das suas ligas começar, ele aparece aqui.
Ändere die Filter oder schau in den Spielplan.¦Mude os filtros ou veja o calendário de jogos.
Spielplan öffnen¦Abrir calendário de jogos
In deinen Ligen ist heute nichts angesetzt. Im Spielplan siehst du die nächsten Tage.¦Hoje não há nada marcado nas suas ligas. No calendário de jogos, você vê os próximos dias.
An diesem Tag ist in deinen Ligen nichts angesetzt. Tennis, Formel 1, UFC, Golf und Cricket zeigt ESPN nur für die laufenden Turniere und Wochenenden.¦Neste dia, não há nada marcado nas suas ligas. A ESPN mostra tênis, Fórmula 1, UFC, golfe e críquete só para os torneios em andamento e fins de semana.
Hinweis: Die letzte Aktualisierung hat nicht geklappt. Angezeigt wird der letzte Stand.¦Aviso: a última atualização falhou. É mostrado o último estado.
In den nächsten Tagen keine Spiele deiner Favoriten.¦Nenhum jogo dos seus favoritos nos próximos dias.
Kein Spiel geplant¦Nenhum jogo marcado
Keine Spiele geplant¦Nenhum jogo marcado
Heute keine Spiele.¦Hoje não há jogos.
Gerade keine Ereignisse.¦Nenhum evento no momento.
In diesem Zeitraum liefert ESPN keine Spiele.¦A ESPN não fornece jogos para este período.
Ligen schaltest du im Reiter „Sender“ unter „Ligen“ ein.¦Você liga as ligas na aba "Canais", em "Ligas".
Lade Daten …¦Carregando dados …
Meine Favoriten¦Meus favoritos
Merke dir Teams, Wettbewerbe, Spieler oder Sportarten. Sie erscheinen hier mit ihren Spielen.¦Salve times, competições, jogadores ou esportes. Eles aparecem aqui com seus jogos.
Noch keine Favoriten¦Ainda não há favoritos
Sport entdecken¦Descobrir esportes
Nur Favoriten¦Só favoritos
OK auf eine Sportart merkt sie oder entfernt sie wieder.¦OK em um esporte o salva ou o remove.
Wichtige Ereignisse¦Eventos importantes
Spielbericht¦Resumo da partida
Direktvergleich¦Confronto direto
Form¦Forma
Klassement¦Classificação
Kampfabend¦Card da noite
Spieler¦Jogadores
Startelf¦Time titular
Ersatzbank¦Banco de reservas
eingewechselt¦entrou
ausgewechselt¦saiu
Satz¦Set
Sätze¦Sets
Spitze¦Líderes
Torjäger¦Artilheiros
Topspieler¦Melhores jogadores
Wettbewerbe¦Competições
Aktuell¦Atual
Geboren¦Nascido
Gewicht¦Peso
Nation¦Nacionalidade
Nummer¦Número
Team¦Time
Beginn: {0}¦Início: {0}
{0} führt {1} gegen {2}.¦{0} lidera {1} contra {2}.
{0} gewinnt {1} gegen {2}.¦{0} vence {1} contra {2}.
Es steht {0} zwischen {1} und {2}.¦Está {0} entre {1} e {2}.
{0} und {1} trennen sich {2}.¦{0} e {1} empatam {2}.
Pkt¦Pts
Sp¦J
S¦V
U¦E
N¦D
TD¦SG
OTN¦DP
Serie¦Sequência
J.¦anos
Am Handy eingeben¦Digite no celular
Schlüssel vom Handy erhalten und gespeichert. Jetzt „Speichern und prüfen“ drücken.¦Chave recebida do celular e salva. Agora toque em "Salvar e verificar".
Eingabe am Handy beenden¦Encerrar entrada no celular
Untertitel online suchen¦Buscar legendas online
Kostenlos unter subdl.com > Konto > API. Im Player unter „Audio & Untertitel“ > „Untertitel online suchen“ werden beide Dienste gefragt.¦Grátis em subdl.com > Conta > API. No player, em “Áudio e legendas” > “Buscar legendas online”, os dois serviços são consultados.
Keine Untertitel in den gewünschten Sprachen¦Sem legendas nos idiomas desejados
Kein Schlüssel für die Untertitel-Suche. Einstellungen > API-Schlüssel¦Sem chave para a busca de legendas. Configurações > Chaves de API
"""
