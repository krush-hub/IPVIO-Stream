package com.ipvio.stream

val DictPtI = """
Outfit¦Outfit
Inter¦Inter
System¦Sistema
Noch keine Favoriten¦Ainda não há favoritos
Zu Live TV¦Ir para TV ao vivo
Noch nichts in deiner Liste¦Ainda não há nada na sua lista
Filme entdecken¦Descobrir filmes
Noch nichts angesehen¦Você ainda não assistiu nada
Hier erscheinen die zuletzt gestarteten Filme und Serien.¦Aqui aparecem os filmes e séries iniciados recentemente.
Auf einem Sender OK gedrückt halten, bei Filmen und Serien auf der Detailseite „Zu Favoriten“ wählen.¦Segure OK em um canal; para filmes e séries, escolha "Aos favoritos" na página de detalhes.
Auf der Seite eines Films oder einer Serie „Meine Liste“ wählen.¦Escolha "Minha lista" na página de um filme ou de uma série.
Keine Treffer¦Nenhum resultado
Mit diesen Filtern gibt es hier keine Titel.¦Não há títulos aqui com esses filtros.
Filter zurücksetzen¦Redefinir filtros
Diese Liste ist noch leer¦Esta lista ainda está vazia
Auf einem Sender OK gedrückt halten und „Zu Favoriten“ wählen.¦Segure OK em um canal e escolha "Aos favoritos".
In „Alle Sender“ oder einer Kategorie auf einem Sender OK gedrückt halten und „Zu …“ wählen.¦Em "Todos os canais" ou em uma categoria, segure OK em um canal e escolha "Para …".
In dieser Kategorie gibt es keine Sender. Links eine andere Kategorie wählen.¦Não há canais nesta categoria. Escolha outra categoria à esquerda.
Prüfe die Schreibweise oder suche nach einem Teil des Titels. Kleine Tippfehler findet die Suche trotzdem.¦Confira a ortografia ou busque parte do título. A busca encontra até pequenos erros de digitação.
Outfit (Standard) und Inter sind in die App eingebaut, die übrigen Schriften stammen von deinem Gerät.¦Outfit (padrão) e Inter já vêm embutidas no app; as demais fontes vêm do seu dispositivo.
Top 10 heute¦Top 10 de hoje
Danach¦Depois
Für diesen Sender gibt es kein Programm.¦Não há guia de programação para este canal.
FILM¦FILME
SERIE¦SÉRIE
Runter für Details und Abspielen¦Para baixo: detalhes e reprodução
Links/Rechts = {#0} s springen¦Esquerda/Direita = pular {#0} s
2020er¦Anos 2020
2010er¦Anos 2010
2000er¦Anos 2000
1990er¦Anos 1990
Infos auf dem Poster¦Informações no pôster
Breites Szenenbild¦Imagem de cena ampla
Neu: Version {0}¦Novo: versão {0}
Fehler {#0}¦Erro {#0}
Keine Update-Adresse eingetragen¦Nenhum endereço de atualização informado
Update-Datei unvollständig¦Arquivo de atualização incompleto
Leere Antwort¦Resposta vazia
Lade … {#0} %¦Carregando … {#0} %
Erlaube der App einmal „Apps installieren“ und tippe dann erneut.¦Permita ao app "Instalar apps" uma vez e toque novamente.
Trage die Adresse einer kleinen Datei update.json ein, die du selbst bereitstellst: {"versionCode": 2, "versionName": "1.1", "apk": "ipvio.apk"}. Die neue APK muss mit demselben Schlüssel signiert sein wie die installierte, sonst lehnt Android sie ab.¦Informe o endereço de um pequeno arquivo update.json que você mesmo disponibiliza: {"versionCode": 2, "versionName": "1.1", "apk": "ipvio.apk"}. O novo APK precisa ser assinado com a mesma chave do instalado, senão o Android o rejeita.
Startet die nächste Folge, sobald der Abspann beginnt. Geht nur, wenn für die Serie Abspann-Zeiten bekannt sind (TheIntroDB); sonst bleibt es beim Hinweis in den letzten 30 Sekunden.¦Inicia o próximo episódio assim que os créditos começarem. Só funciona se os tempos dos créditos da série forem conhecidos (TheIntroDB); caso contrário, fica só o aviso nos últimos 30 segundos.
Zeigt die aktuelle Uhrzeit beim Abspielen in einer Ecke (nicht, solange die Steuerleiste offen ist).¦Mostra a hora atual em um canto durante a reprodução (não enquanto a barra de controles estiver aberta).
Oben rechts¦Canto superior direito
Oben links¦Canto superior esquerdo
Unten rechts¦Canto inferior direito
Unten links¦Canto inferior esquerdo
Die Uhr folgt der Zeitzone und dem 12/24-Stunden-Format aus den Einstellungen. Im Player geht es auch über Einstellungen > Uhrzeit.¦O relógio segue o fuso horário e o formato de 12/24 horas das configurações. No player, também dá para ajustar em Configurações > Relógio.
Ein größerer Puffer lädt mehr Film im Voraus und verhindert Ruckeln bei schwacher Leitung; dafür dauert der Start etwas länger und es wird mehr Speicher gebraucht. „Automatisch“ beginnt normal und vergrößert den Puffer von selbst, wenn es mehrfach ruckelt (aktuell Stufe {#0}). Gilt ab dem nächsten gestarteten Titel.¦Um buffer maior carrega mais do filme com antecedência e evita travamentos com conexão fraca; em troca, o início demora um pouco mais e usa mais memória. "Automático" começa normal e aumenta o buffer sozinho se travar várias vezes (nível atual {#0}). Vale a partir do próximo título iniciado.
Passt die Bildwiederholrate des Fernsehers an den Film an (z. B. 24 Bilder), wenn der Fernseher das ohne Bildaussetzer kann. Bei Fire TV zusätzlich in den Geräteeinstellungen „Originale Bildrate anpassen“ prüfen.¦Ajusta a taxa de atualização da TV ao filme (ex.: 24 quadros), se a TV conseguir fazer isso sem falhas na imagem. No Fire TV, confira também "Ajustar taxa de quadros original" nas configurações do dispositivo.
{#0} min¦{#0} min
Quelle {#0}¦Fonte {#0}
Tonspur „{0}“ ist mit diesem Ausgang nicht abspielbar – andere Spur im Menü wählen¦A faixa de áudio "{0}" não pode ser reproduzida com esta saída – escolha outra faixa no menu
Diese Tonspur kann hier nicht abgespielt werden – andere Spur gewählt¦Esta faixa de áudio não pode ser reproduzida aqui – outra faixa foi selecionada
Verbindung hängt – neuer Versuch ({#0}/2)¦Conexão travada – nova tentativa ({#0}/2)
Video-Rate (laut Datei): {0}¦Taxa de vídeo (segundo o arquivo): {0}
Ton: {0}¦Áudio: {0}
Puffer: {0}¦Buffer: {0}
Auto (5)¦Auto (5)
Weil du „{0}“ geschaut hast¦Porque você assistiu "{0}"
Ähnlich wie {0}¦Semelhante a {0}
Oben findest du alle {0}, Neuheiten, Top bewertet und Kategorien.¦Acima você encontra todos os {0}, novidades, mais bem avaliados e categorias.
Fortsetzen · {#0} Min¦Continuar · {#0} min
Weiter mit S{#0} · Folge {#1}¦Continuar com T{#0} · Episódio {#1}
noch nichts gemerkt¦nada salvo ainda
Liste angelegt. Mit „Sender hinzufügen“ füllen.¦Lista criada. Preencha com "Adicionar canal".
Zu „¦Para “
“ hinzufügen: OK auf einem Sender fügt ihn hinzu bzw. entfernt ihn wieder¦” adicionar: OK em um canal o adiciona ou o remove novamente
Entfernt¦Removido
Hinzugefügt¦Adicionado
Diese Playlist ist sehr groß: {0} Titel in {#1} Sprachen.¦Esta playlist é muito grande: {0} títulos em {#1} idiomas.
„Alles laden“ lädt alle {0} Titel. Das kann einige Minuten dauern.¦"Carregar tudo" carrega todos os {0} títulos. Isso pode levar alguns minutos.
Gewählt: {0} Titel¦Selecionados: {0} títulos
Das dauert gerade sehr lange.¦Isso está demorando muito.
Sehr große Playlists brauchen lange. Mit der Sprachauswahl lädst du nur die Titel, die du wirklich brauchst.¦Playlists muito grandes demoram. Com a seleção de idioma, você carrega só os títulos de que realmente precisa.
Server nicht gefunden (DNS)¦Servidor não encontrado (DNS)
Sichere Verbindung fehlgeschlagen. Datum und Uhrzeit des Geräts prüfen¦Falha na conexão segura. Confira a data e a hora do dispositivo
Zeitüberschreitung, Server antwortet nicht¦Tempo esgotado, o servidor não responde
API-Schlüssel¦Chaves de API
TMDB, IMDb und Rotten Tomatoes¦TMDB, IMDb e Rotten Tomatoes
Die App enthält keine eigenen Schlüssel. Mit deinen eigenen, kostenlosen Schlüsseln zeigt sie Poster, Beschreibungen, Besetzung, Trailer, automatische Genres sowie IMDb- und Rotten-Tomatoes-Wertungen. Ohne Schlüssel übernimmt sie Beschreibung, Cover und Bewertung von deinem Anbieter (bei Xtream-Zugängen).¦O app não traz chaves próprias. Com suas chaves gratuitas, ele mostra pôsteres, descrições, elenco, trailers, gêneros automáticos e avaliações do IMDb e do Rotten Tomatoes. Sem chaves, ele usa a descrição, a capa e a avaliação do seu provedor (em acessos Xtream).
TMDB (Film-Infos)¦TMDB (informações de filmes)
TMDB API-Schlüssel (v3)¦Chave de API TMDB (v3)
Kostenlos unter themoviedb.org: Konto anlegen, anmelden, dann Einstellungen > API > API-Schlüssel anfordern und den 32-stelligen „API Key“ eintragen. Dieses Produkt verwendet die TMDB-API, wird aber nicht von TMDB unterstützt oder zertifiziert.¦Grátis em themoviedb.org: crie uma conta, faça login e depois vá em Configurações > API > solicitar chave de API e informe a "API Key" de 32 caracteres. Este produto usa a API do TMDB, mas não é endossado nem certificado pelo TMDB.
OMDb (IMDb- und Rotten-Tomatoes-Wertung)¦OMDb (avaliações do IMDb e do Rotten Tomatoes)
OMDb API-Schlüssel¦Chave de API OMDb
Kostenlos unter omdbapi.com > API Key (FREE). Danach den Aktivierungslink in der E-Mail anklicken, sonst funktioniert der Schlüssel nicht. Geht auch ohne TMDB-Schlüssel.¦Grátis em omdbapi.com > API Key (FREE). Depois clique no link de ativação no e-mail, senão a chave não funciona. Também funciona sem chave do TMDB.
Speichern und prüfen¦Salvar e verificar
Schlüssel entfernen¦Remover chaves
Schlüssel gültig¦Chave válida
Schlüssel ungültig¦Chave inválida
Keine Verbindung¦Sem conexão
Die Schlüssel bleiben nur auf diesem Gerät. Nach dem Eintragen die App einmal neu starten, damit alle Bereiche die Infos laden. Intro- und Abspann-Zeiten kommen von TheIntroDB und brauchen keinen Schlüssel.¦As chaves ficam só neste dispositivo. Depois de informá-las, reinicie o app uma vez para que todas as áreas carreguem as informações. Os tempos de intro e créditos vêm do TheIntroDB e não precisam de chave.
Dieses Produkt verwendet die TMDB-API, wird aber nicht von TMDB unterstützt oder zertifiziert. Wertungen: OMDb. Intro-Zeiten: TheIntroDB.¦Este produto usa a API do TMDB, mas não é endossado nem certificado pelo TMDB. Avaliações: OMDb. Tempos de intro: TheIntroDB.
NexTV ist freie Software unter der GNU General Public License v3 (GPL-3.0). Verwendete Bibliotheken: AndroidX/Jetpack Compose, Media3 (Apache 2.0), OkHttp, Coil (Apache 2.0), Jellyfin FFmpeg-Decoder (GPL-3.0), Schriften Outfit und Inter (SIL Open Font License).¦NexTV é software livre sob a GNU General Public License v3 (GPL-3.0). Bibliotecas usadas: AndroidX/Jetpack Compose, Media3 (Apache 2.0), OkHttp, Coil (Apache 2.0), decodificador FFmpeg do Jellyfin (GPL-3.0), fontes Outfit e Inter (SIL Open Font License).
Automatische Genres brauchen einen TMDB-Schlüssel (Einstellungen > API-Schlüssel).¦Gêneros automáticos precisam de uma chave TMDB (Configurações > Chaves de API).
Tipp: Unter Einstellungen > API-Schlüssel einen eigenen TMDB-Schlüssel eintragen, dann erscheinen hier Beschreibung, Cover und Bewertungen.¦Dica: em Configurações > Chaves de API, informe sua própria chave TMDB e aqui aparecerão descrição, capa e avaliações.
"""
