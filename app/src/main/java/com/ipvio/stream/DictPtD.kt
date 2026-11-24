package com.ipvio.stream

val DictPtD = """
Farbthema¦Tema de cores
Eigene Farbe¦Cor personalizada
Übernehmen¦Aplicar
Ungültig¦Inválido
Wähle ein Farbfeld oder gib einen Hex-Code ein, z. B. #FF6A00. Die App passt die Farbe automatisch so an, dass Schrift immer gut lesbar bleibt.¦Escolha uma amostra de cor ou digite um código hexadecimal, por exemplo, #FF6A00. O app ajusta a cor automaticamente para que o texto fique sempre legível.
Darstellung¦Aparência
Animationen¦Animações
Anzeigegröße¦Tamanho da tela
Oberfläche aktuell ×¦Interface atual ×
 (Bildschirm ¦ (tela 
 dp breit). Standard ist 85 %: mehr Inhalt, Elemente bleiben gut lesbar. „Automatisch“ vergrößert die App auf sehr breiten Bildschirmen.¦ dp de largura). O padrão é 85%: mais conteúdo, e os elementos continuam fáceis de ler. “Automático” amplia o app em telas muito largas.
Schrift¦Fonte
Schriftart¦Tipo de fonte
Schriftgröße¦Tamanho da fonte
Aa – So sieht deine Schrift aus¦Aa – É assim que sua fonte fica
Fünf klare Systemschriften, die auf jedem Gerät vorhanden sind. Die Schriftgröße wirkt zusätzlich zur Anzeigegröße.¦Cinco fontes de sistema limpas, presentes em todos os aparelhos. O tamanho da fonte vale além do tamanho da tela.
Vorschau¦Prévia
Aktiv¦Ativo
Hervorhebung¦Destaque
Animationen „Aus“ schaltet die Vergrößerung beim Fokus ab, „Dezent“ macht sie schwächer. Das schont schwache Geräte.¦Com Animações em “Desligado”, o zoom ao focar é desativado; em “Discreto”, ele fica mais suave. Isso poupa aparelhos mais fracos.
Design zurücksetzen¦Redefinir design
keiner seit dem Start¦nenhum desde o início
Version¦Versão
Bildschirm¦Tela
{0} × {1} dp · Dichte¦{0} × {1} dp · densidade
Inhalte¦Conteúdo
{0} Sender · {1} Filme · {2} Serien¦{0} canais · {1} filmes · {2} séries
Ladezustand¦Status de carregamento
Programm (EPG)¦Programação (EPG)
{0} · {1} Sender¦{0} · {1} canais
lädt {0}/{1}¦carregando {0}/{1}
kein TMDB-Schlüssel¦sem chave TMDB
Letzter Fehler¦Último erro
Fehler seit Start¦Erros desde o início
Playlist neu laden¦Recarregar playlist
Bericht kopieren¦Copiar relatório
NexTV Diagnose¦Diagnóstico NexTV
Der Bericht enthält keine Adressen, Benutzernamen oder Passwörter. Er wird nur in die Zwischenablage kopiert und nirgendwohin gesendet.¦O relatório não contém endereços, nomes de usuário nem senhas. Ele só é copiado para a área de transferência e não é enviado para lugar nenhum.
Tonspur¦Faixa de áudio
Automatische Genres¦Gêneros automáticos
Aus = Kategorien deines Anbieters¦Desligado = categorias do seu provedor
Automatische Genres sortieren Titel nach Genre (Anime = Animation aus Japan). Beim ersten Mal dauert das einige Minuten, danach ist alles gespeichert. Aus = die Kategorien deines Anbieters in der Reihenfolge deines Anbieters. In der Ansicht „Kategorien“ kannst du jederzeit zwischen beiden wechseln.¦Os gêneros automáticos organizam os títulos por gênero (Anime = animação do Japão). Na primeira vez, leva alguns minutos; depois, tudo fica salvo. Desligado = as categorias do seu provedor, na ordem dele. Na tela “Categorias”, você pode alternar entre os dois quando quiser.
Automatische Genres brauchen den TMDB-Schlüssel in Config.kt.¦Os gêneros automáticos precisam da chave TMDB em Config.kt.
TV-Programm (EPG)¦Programação de TV (EPG)
Programm bei {0} von {1} Sendern möglich¦Programação disponível em {0} de {1} canais
XMLTV: {0}¦XMLTV: {0}
Die App sucht die Programmdaten automatisch (Xtream-Schnittstelle oder XMLTV-Adresse aus der Playlist). Wenn dein Anbieter eine eigene XMLTV-Adresse nennt, trage sie hier ein.¦O app busca os dados da programação automaticamente (interface Xtream ou endereço XMLTV da playlist). Se o seu provedor informar um endereço XMLTV próprio, digite-o aqui.
Speichern & laden¦Salvar e carregar
Neu laden¦Recarregar
Sender oder Kategorien als Favorit markieren: OK gedrückt halten oder Menü-Taste.¦Para marcar canais ou categorias como favoritos: segure OK ou pressione o botão Menu.
Meine Playlists ({0})¦Minhas playlists ({0})
Aktivieren¦Ativar
Umbenennen¦Renomear
Löschen¦Excluir
Name der Playlist¦Nome da playlist
Name speichern¦Salvar nome
+ Weitere Playlist hinzufügen¦+ Adicionar outra playlist
Aktive Playlist neu laden¦Recarregar playlist ativa
Automatisch aktualisieren¦Atualizar automaticamente
Bei jedem Start¦A cada início
Täglich¦Diariamente
Wöchentlich¦Semanalmente
Nur von Hand¦Só manualmente
Playlist aktualisieren¦Atualizar playlist
Abstand¦Intervalo
alle {0} Stunden¦a cada {0} horas
Wochentag¦Dia da semana
Stunde¦Hora
Minute¦Minuto
Zuletzt aktualisiert: ¦Última atualização: 
noch nie¦nunca
Nächste Aktualisierung: ¦Próxima atualização: 
„Bei jedem Start“ lädt die Playlist bei jedem Öffnen der App. Die geplanten Varianten laufen auch im Hintergrund, solange das Gerät eingeschaltet und online ist, und holen verpasste Termine beim nächsten Start nach. „Nur von Hand“ nutzt immer den gespeicherten Stand; Neu laden geht jederzeit mit dem Knopf oben. Die Uhrzeit richtet sich nach deiner Zeitzone unter „Sprache & Region“.¦“A cada início” carrega a playlist sempre que o app é aberto. As opções agendadas também rodam em segundo plano enquanto o aparelho estiver ligado e online, e recuperam os horários perdidos no próximo início. “Só manualmente” usa sempre a cópia salva; você pode recarregar quando quiser com o botão acima. O horário segue o seu fuso horário em “Idioma e região”.
Zugangsdaten werden nur auf diesem Gerät gespeichert und hier nicht angezeigt. Es ist immer eine Playlist aktiv. Mit „Aktivieren“ wechselst du die Liste.¦Os dados de acesso ficam salvos só neste aparelho e não são mostrados aqui. Sempre há uma playlist ativa. Use “Ativar” para trocar de lista.
NexTV · Version ¦NexTV · Versão 
NexTV ist ein Player und liefert selbst keine Inhalte. Nutze nur Quellen, für die du eine Berechtigung hast.¦O NexTV é um player e não oferece nenhum conteúdo. Use apenas fontes para as quais você tem autorização.
Dieses Produkt verwendet die TMDB-API, wird aber nicht von TMDB unterstützt oder zertifiziert. Intro-Zeiten: TheIntroDB.¦Este produto usa a API do TMDB, mas não é apoiado nem certificado pelo TMDB. Horários de intro: TheIntroDB.
Systemeinstellungen der App¦Configurações de sistema do app
Setzt Ansicht, Design, Menü, Player, Ton und Start auf die Standardwerte. Playlists, Favoriten, Verlauf und Fortsetzen-Positionen bleiben erhalten. Zwischenspeicher leerst du unter „Speicher“.¦Redefine visualização, design, menu, player, som e início para os valores padrão. Playlists, favoritos, histórico e pontos de continuação são mantidos. Você limpa o cache em “Armazenamento”.
"""
