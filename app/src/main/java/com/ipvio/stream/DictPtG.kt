package com.ipvio.stream

val DictPtG = """
Folgen {0}¦Episódios {0}
{#0} Abschnitte¦{#0} seções
Links/Rechts = Abschnitt wechseln¦Esquerda/Direita = trocar de seção
Zu Folge springen¦Ir para o episódio
Gehe zu Folge …¦Ir para o episódio …
Folgennummer¦Número do episódio
Springen¦Ir
Fortsetzen¦Continuar
Gesehen¦Assistido
Weiter mit {0}¦Continuar com {0}
Als Nächstes¦A seguir
Menü-Taste oder OK lange drücken = entfernen¦Botão Menu ou segurar OK = remover
Aus „Weiterschauen“ entfernt¦Removido de “Continuar assistindo”
Rechts / Vorspulen = 50 weiter¦Direita / avançar = 50 à frente
Zurückspulen = zurück¦Voltar = para trás
Links schließt¦Esquerda fecha
Italienisch¦Italiano
Portugiesisch¦Português
Polnisch¦Polonês
Russisch¦Russo
Arabisch¦Árabe
Niederländisch¦Holandês
Keine¦Nenhum
Zweite Tonspur¦Segundo idioma de áudio
Wie die App-Sprache¦Igual ao idioma do app
Immer an¦Sempre ligado
Nur bei fremder Tonspur¦Só com áudio estrangeiro
Sprache der Untertitel¦Idioma da legenda
Untertitel für Hörgeschädigte (CC)¦Legendas para deficientes auditivos (CC)
Bevorzugt Untertitel mit Geräuschen und Sprecherangaben ([Musik], [Tür knallt]), wenn der Stream welche hat.¦Prefere legendas com sons e indicação de quem fala ([música], [porta bate]), quando o stream tiver.
„Nur bei fremder Tonspur“: Läuft ein Titel in einer Sprache, die du nicht eingestellt hast (z. B. Japanisch), erscheinen Untertitel automatisch; bei deiner Sprache bleiben sie aus. Wählst du im Player unter Audio & Untertitel von Hand, merkt sich die App das für diese Serie bzw. diesen Film – die nächste Folge startet gleich richtig.¦“Só com áudio estrangeiro”: se um título estiver em um idioma que você não configurou (por exemplo, japonês), as legendas aparecem automaticamente; no seu idioma, ficam desligadas. Se você escolher manualmente no player, em Áudio e legendas, o app lembra a escolha para essa série ou filme — o próximo episódio já começa certo.
Quelle & Qualität¦Fonte e qualidade
Bei mehreren Quellen¦Com várias fontes
Automatisch (passend zum Gerät)¦Automático (conforme o aparelho)
Immer die höchste¦Sempre a mais alta
Höchstens Full HD¦No máximo Full HD
Höchstens HD (spart Daten)¦No máximo HD (economiza dados)
Bei Störung automatisch wechseln¦Trocar automaticamente em caso de falha
Ruckelt ein Titel mehrmals oder lässt er sich nicht abspielen, nimmt die App eine andere (kleinere) Quelle desselben Titels – an derselben Stelle.¦Se um título travar várias vezes ou não reproduzir, o app usa outra fonte (menor) do mesmo título — no mesmo ponto.
Dieses Gerät¦Este aparelho
4K-Bildschirm¦Tela 4K
Full-HD-Bildschirm¦Tela Full HD
HD-Bildschirm¦Tela HD
Bildschirm unbekannt¦Tela desconhecida
4K-Decoder¦Decodificador 4K
ja¦sim
nein¦não
Gelernt: 4K ruckelte hier mehrmals – Automatik nimmt höchstens Full HD.¦Aprendido: o 4K travou aqui várias vezes — o automático agora usa no máximo Full HD.
Viele Anbieter haben denselben Film mehrfach (4K, FHD, HD). „Automatisch“ nimmt die beste Quelle, die dein Gerät flüssig schafft: 4K nur mit 4K-Bildschirm und passendem Decoder. Eine feste Wahl auf der Detailseite hat immer Vorrang.¦Muitos provedores têm o mesmo filme várias vezes (4K, FHD, HD). “Automático” usa a melhor fonte que o seu aparelho reproduz sem travar: 4K só com tela 4K e decodificador compatível. Uma escolha fixa na página de detalhes sempre vale mais.
Defekte Links¦Links com defeito
Keine gestörten Titel bekannt.¦Nenhum título com defeito conhecido.
{#0} Titel als gestört gemerkt¦{#0} títulos marcados como defeituosos
Gestörte Titel ausblenden¦Ocultar títulos defeituosos
Blendet Filme und Sender aus, die beim Abspielen „nicht mehr vorhanden“ meldeten oder mehrmals scheiterten. Sonst tragen sie ein Warnsymbol.¦Oculta filmes e canais que informaram “não existe mais” ao reproduzir ou falharam várias vezes. Se não, eles mostram um símbolo de aviso.
Liste leeren¦Limpar lista
Die App prüft nicht von sich aus Tausende Links – das würde dein Anbieter als Missbrauch werten. Sie merkt sich nur, was beim Abspielen schiefging. Ohne Internet, bei Zugangs- oder Serverproblemen wird nichts gemerkt. Spielt ein Titel wieder, ist er sofort freigegeben.¦O app não verifica milhares de links por conta própria — seu provedor consideraria isso abuso. Ele só lembra o que deu errado durante a reprodução. Sem internet, ou com problemas de acesso ou do servidor, nada é registrado. Assim que um título voltar a funcionar, ele é liberado na hora.
Bildspur¦Faixa de vídeo
{#0} Quellen¦{#0} fontes
Gestört¦Defeituoso
{0} – wechsle auf {1}¦{0} – mudando para {1}
Quelle gestört¦Fonte defeituosa
Ruckelt¦Travando
Format nicht abspielbar¦Formato não reproduzível
andere Quelle¦outra fonte
{0} passt nicht zu diesem Gerät – spiele {1}¦{0} não serve para este aparelho — reproduzindo {1}
Diese Qualität¦Esta qualidade
Quelle gestört – spiele eine andere¦Fonte defeituosa — reproduzindo outra
bei Störung wird automatisch gewechselt¦troca sozinha em caso de falha
Diese Quelle war zuletzt nicht erreichbar – es wird eine andere genommen.¦Esta fonte estava inacessível da última vez — será usada outra.
Diese Quelle war zuletzt nicht erreichbar.¦Esta fonte estava inacessível da última vez.
Spulen, Intro, Qualität, defekte Links¦Avanço, intro, qualidade, links defeituosos
Sprachen, CC, Untertitel-Stil¦Idiomas, CC, estilo de legenda
Neue Senderliste¦Nova lista de canais
Neue Senderliste …¦Nova lista de canais …
Senderliste {#0}¦Lista de canais {#0}
Liste löschen¦Excluir lista
Liste umbenennen¦Renomear lista
Name¦Nome
Speichern¦Salvar
Zu Favoriten¦Adicionar aos favoritos
Aus Favoriten entfernen¦Remover dos favoritos
Nach oben¦Mover para cima
Nach unten¦Mover para baixo
Aus „{0}“ entfernen¦Remover de “{0}”
In „{0}“ – entfernen¦Em “{0}” – remover
Zu „{0}“¦Adicionar a “{0}”
Erinnern¦Lembrar
Erinnerung löschen¦Excluir lembrete
Sender jetzt ansehen¦Assistir ao canal agora
Erinnerung gesetzt – {#0} Min vorher¦Lembrete criado – {#0} min antes
Erinnerung gelöscht¦Lembrete excluído
Erinnerung¦Lembrete
Erinnerungen¦Lembretes
ansehen / später: erinnern¦assistir / depois: lembrar
Läuft jetzt¦Passando agora
In {#0} Min¦Em {#0} min
Antippen öffnet den Sender¦Toque para abrir o canal
Umschalten¦Trocar
Schließen¦Fechar
Eigene Senderlisten¦Listas de canais próprias
Noch keine eigenen Listen.¦Ainda não há listas próprias.
Zum Beginn¦No começo
{#0} Min vorher¦{#0} min antes
Keine Erinnerungen gesetzt.¦Nenhum lembrete criado.
Im TV-Guide auf einer späteren Sendung OK drücken > „Erinnern“. Ist die App offen, erscheint eine Karte mit „Umschalten“ (auch während du etwas anderes schaust). Ist sie geschlossen, kommt eine Benachrichtigung – antippen öffnet den Sender. Das Gerät muss dafür eingeschaltet sein (Standby reicht meist); manche Geräte zeigen Benachrichtigungen nur in ihrer Mitteilungsliste.¦No guia de TV, pressione OK em um programa futuro > “Lembrar”. Se o app estiver aberto, aparece um cartão com “Trocar” (mesmo enquanto você assiste outra coisa). Se estiver fechado, chega uma notificação — toque para abrir o canal. O aparelho precisa estar ligado (o modo de espera geralmente basta); alguns aparelhos mostram notificações só na lista de notificações deles.
TV-Programm, Senderlisten, Erinnerungen¦Guia de TV, listas de canais, lembretes
Film, Serie oder Sender sagen …¦Diga um filme, série ou canal …
Sprechen¦Falar
Mit dem Handy suchen¦Buscar pelo celular
Öffne auf dem Handy (gleiches WLAN):¦Abra no celular (mesmo Wi-Fi):
Code: {#0}¦Código: {#0}
Dann tippen oder auf das Mikrofon der Handy-Tastatur tippen und sprechen. Der Begriff erscheint sofort hier.¦Depois digite, ou toque no microfone do teclado do celular e fale. O termo aparece aqui na hora.
Gesucht¦Buscado
Film, Serie oder Sender¦Filme, série ou canal
Tipp: Tippe auf das Mikrofon deiner Handy-Tastatur und sprich den Titel.¦Dica: toque no microfone do teclado do celular e diga o título.
Läuft gerade ein Film oder Sender, wartet die Aktualisierung, bis du fertig bist – so ruckelt nichts.¦Se um filme ou canal estiver passando, a atualização espera você terminar — assim nada trava.
Abdunkeln¦Escurecer
Ausblenden¦Ocultar
Archiv¦Arquivo
Archiv (Catchup)¦Arquivo (catch-up)
Archiv: verpasste Sendungen¦Arquivo: programas perdidos
IM ARCHIV¦NO ARQUIVO
Deine Playlist meldet keine Sender mit Archiv.¦Sua playlist não informa canais com arquivo.
{#0} Sender mit Archiv¦{#0} canais com arquivo
{#0} Tage¦{#0} dias
1 Tag¦1 dia
Diese Sendung ist im Archiv des Anbieters nicht abrufbar.  Zurück = Live-Sender.¦Este programa não está disponível no arquivo do provedor.  Voltar = canal ao vivo.
Kein Programm bekannt¦Nenhuma programação conhecida
Keine vergangenen Sendungen im Programm.¦Nenhum programa passado na programação.
Nicht im Archiv verfügbar¦Não disponível no arquivo
Nächste Sendung: Live¦Próximo programa: ao vivo
Nächste Sendung: {0}¦Próximo programa: {0}
Vorherige Sendung¦Programa anterior
Vorherige Sendung: {0}¦Programa anterior: {0}
Von Anfang an¦Desde o começo
ansehen / Archiv / erinnern¦assistir / arquivo / lembrar
Sender mit Archiv tragen das Archiv-Symbol. Im TV-Guide lassen sich vergangene Sendungen dieser Sender mit OK abspielen (Spulen-Tasten = einen Tag zurück/vor). Im Player: „Von Anfang an“ startet die laufende Sendung neu, „Archiv“ listet die verpassten Sendungen. Am Ende einer Sendung geht es mit der nächsten weiter, Zurück führt zum Live-Bild. Welche Sender ein Archiv haben und wie viele Tage es reicht, bestimmt dein Anbieter.¦Canais com arquivo mostram o símbolo de arquivo. No guia de TV, você pode assistir aos programas passados desses canais com OK (botões de avançar/voltar = um dia para frente/para trás). No player, “Desde o começo” reinicia o programa atual e “Arquivo” lista os programas perdidos. Ao fim de um programa, começa o próximo; Voltar leva à imagem ao vivo. Quais canais têm arquivo e por quantos dias, quem decide é o seu provedor.
Rating: beste zuerst¦Avaliação: melhor primeiro
Rating: schwächste zuerst¦Avaliação: pior primeiro
Jahr: neueste zuerst¦Ano: mais recente primeiro
Jahr: älteste zuerst¦Ano: mais antigo primeiro
Noch keine Favoriten. Auf einem Sender OK gedrückt halten und „Zu Favoriten“ wählen.¦Ainda não há favoritos. Segure OK em um canal e escolha “Adicionar aos favoritos”.
Diese Liste ist noch leer. In „Alle Sender“ oder einer Kategorie auf einem Sender OK gedrückt halten und „Zu …“ wählen.¦Esta lista ainda está vazia. Em “Todos os canais” ou em uma categoria, segure OK em um canal e escolha “Adicionar a …”.
Sender als Favorit: auf dem Sender OK gedrückt halten > „Zu Favoriten“. Kategorie als Favorit: auf der Kategorie OK gedrückt halten.¦Canal como favorito: segure OK no canal > “Adicionar aos favoritos”. Categoria como favorita: segure OK na categoria.
halten = Favorit / Listen¦segurar = favorito / listas
Anlegen: Live TV > „Neue Senderliste“ oder auf einem Sender OK gedrückt halten > „Neue Senderliste …“. OK gedrückt halten auf einem Sender: Favorit, zu einer Liste hinzufügen oder entfernen, in der Liste nach oben/unten schieben. OK gedrückt halten auf einer Liste: umbenennen oder löschen. Hat deine Fernbedienung eine Menü-Taste, geht es auch damit. Im Player wechselst du mit Links zu deinen Listen; Umschalten bleibt in der Liste.¦Criar: TV ao vivo > “Nova lista de canais” ou segure OK em um canal > “Nova lista de canais …”. Segure OK em um canal: favorito, adicionar a uma lista ou remover, mover para cima/baixo na lista. Segure OK em uma lista: renomear ou excluir. Se o seu controle remoto tiver um botão Menu, ele também funciona. No player, você vai para as suas listas com Esquerda; a troca de canal fica dentro da lista.
Abschnitt¦Seção
Staffel¦Temporada
1 Staffel¦1 temporada
{#0} Staffeln¦{#0} temporadas
1 Folge¦1 episódio
{#0} Folgen¦{#0} episódios
Alle Einstellungen zurücksetzen¦Redefinir todas as configurações
Jetzt prüfen¦Verificar agora
Letzten Film / letzte Serie beim Start fortsetzen¦Continuar o último filme / a última série ao iniciar
Wenn du zuletzt einen Film oder eine Serie gesehen hast, läuft sie nach dem Start an der gemerkten Stelle weiter (bei einer fertigen Folge mit der nächsten).¦Se você assistiu por último a um filme ou série, a reprodução continua de onde você parou depois do início (depois de um episódio terminado, com o próximo).
Aktuelles Design¦Design atual
Markiere eine Farbe, um sie hier zu sehen.¦Marque uma cor para vê-la aqui.
Nur Vorschau – OK übernimmt das Design.¦Só uma prévia — OK aplica o design.
Neu¦Novo
Automatische Genres, Kategorien¦Gêneros automáticos, categorias
Verwalten, Sprachen, Aktualisieren¦Gerenciar, idiomas, atualizar
Sprachen der Inhalte öffnen¦Abrir idiomas do conteúdo
Welche Sprachen geladen werden, stellst du unter „Playlists“ ein – das bestimmt, was aus der Playlist geladen wird.¦Quais idiomas são carregados, você escolhe em “Playlists” — isso define o que é carregado da playlist.
Deine Bibliothek ist für automatische Genres zu groß (über 60.000 Filme und Serien). Es werden die Kategorien deines Anbieters verwendet. Blende unter „Playlists“ > „Sprachen der Inhalte“ Sprachen aus, die du nicht brauchst – dann passt es wieder.¦Sua biblioteca é grande demais para os gêneros automáticos (mais de 60.000 filmes e séries). Serão usadas as categorias do seu provedor. Em “Playlists” > “Idiomas do conteúdo”, oculte os idiomas de que você não precisa — aí volta a caber.
Alle an¦Tudo ligado
Alle aus¦Tudo desligado
Übernehmen und laden¦Aplicar e carregar
Verwerfen¦Descartar
{#0} von {#1} Sprachen gewählt¦{#0} de {#1} idiomas selecionados
{#0} Sender¦{#0} canais
{#0} Filme¦{#0} filmes
{#0} Serien¦{#0} séries
Aktuelle Liste¦Lista atual
Archiv deines Anbieters¦Arquivo do seu provedor
Aufnahmen¦Gravações
Aus dem Archiv ansehen¦Assistir pelo arquivo
Beliebte Filme¦Filmes populares
Beliebte Serien¦Séries populares
Deine Playlist meldet keine Sender mit Archiv. Wenn dein Anbieter ein Archiv (Catchup) anbietet, erscheinen die Sender hier nach dem nächsten Laden der Playlist.¦Sua playlist não informa canais com arquivo. Se o seu provedor oferece arquivo (catch-up), os canais aparecem aqui depois do próximo carregamento da playlist.
Hallo, {0}¦Olá, {0}
Keine Erinnerungen¦Sem lembretes
Live¦Ao vivo
Nächste Sendungen¦Próximos programas
Sendungen aus dem Archiv deines Anbieters¦Programas do arquivo do seu provedor
Suche nach Sendern, Filmen, Serien …¦Busque canais, filmes, séries …
Home¦Início
EPG¦EPG
TV-Programm¦Guia de TV
Deine Auswahl¦Sua seleção
Noch nichts in deiner Liste. Auf der Seite eines Films oder einer Serie „Meine Liste“ wählen.¦Ainda não há nada na sua lista. Na página de um filme ou série, escolha “Minha lista”.
Zur Liste¦Adicionar à lista
OK lange drücken = entfernen¦Segurar OK = remover
Heute¦Hoje
Gestern¦Ontem
Zu Favoriten hinzugefügt¦Adicionado aos favoritos
Aus Favoriten entfernt¦Removido dos favoritos
Links/Rechts = Spalte  ·  Zurück schließt¦Esquerda/Direita = coluna  ·  Voltar fecha
laufender Sender, Kategorien, schließen¦canal atual, categorias, fechar
Zurück: zum laufenden Sender, dann zu den Kategorien, dann schließen.¦Voltar: para o canal atual, depois para as categorias, depois fechar.
Tag¦Dia
Beispieltext¦Texto de exemplo
Bilder bei Filmen und Serien¦Imagens em filmes e séries
Bildschirm füllen¦Preencher a tela
Cover¦Capa
Favorit¦Favorito
Favoriten & Listen¦Favoritos e listas
Intro-Zeiten stammen aus der Community-Datenbank TheIntroDB und gibt es nicht für jede Serie. Die Stream-Info erscheint nur bei Filmen und Serien.¦Os horários de intro vêm do banco de dados da comunidade TheIntroDB e não existem para todas as séries. As informações do stream só aparecem em filmes e séries.
Kartengröße¦Tamanho do cartão
Markiere eine Einstellung, um sie hier zu sehen.¦Marque uma configuração para vê-la aqui.
Noch keine Favoriten. Auf einem Sender OK gedrückt halten, bei Filmen und Serien auf der Detailseite „Zu Favoriten“ wählen.¦Ainda não há favoritos. Segure OK em um canal; em filmes e séries, escolha “Adicionar aos favoritos” na página de detalhes.
Sender, Kategorie, schließen¦canal, categoria, fechar
Szenenbild¦Imagem de cena
Zoom 115 %¦Zoom 115%
Zoom 133 %¦Zoom 133%
Zurück schließt dieses Fenster¦Voltar fecha esta janela
Zurück: zum Sender, dann zur Kategorie, dann schließen.¦Voltar: para o canal, depois para a categoria, depois fechar.
Oben findest du alle Filme, Neuheiten, Top bewertet und Kategorien.¦No topo, você encontra todos os filmes, novidades, mais bem avaliados e categorias.
Oben findest du alle Serien, Neuheiten, Top bewertet und Kategorien.¦No topo, você encontra todas as séries, novidades, mais bem avaliadas e categorias.
Titel pro Zeile¦Títulos por linha
Schriftgröße (gilt für die ganze App)¦Tamanho da fonte (vale para o app inteiro)
Keine Benachrichtigungen¦Sem notificações
Erinnerung setzen¦Criar lembrete
Ansehen¦Assistir
Ansehen / Erinnerung¦Assistir / Lembrete
Alles rund um Aussehen, Wiedergabe und Konto¦Tudo sobre aparência, reprodução e conta
{#0} Episoden¦{#0} episódios
1 Episode¦1 episódio
Neue Folge · Staffel {#0}, Folge {#1}¦Novo episódio · Temporada {#0}, episódio {#1}
{#0} neue Folgen · bis Staffel {#1}, Folge {#2}¦{#0} novos episódios · até a temporada {#1}, episódio {#2}
Es gibt nur {#0} Folgen¦Há apenas {#0} episódios
"""
