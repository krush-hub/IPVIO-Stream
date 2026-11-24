package com.ipvio.stream

val DictPtC = """
Allgemein¦Geral
Start, Beenden, Autostart¦Início, saída, início automático
Sprache & Region¦Idioma e região
Sprache, Uhrzeit, Zeitzone¦Idioma, hora, fuso horário
Kartengröße, Raster¦Tamanho dos cartões, grade
Design¦Design
Farben, Schrift, Animationen¦Cores, fonte, animações
Reihenfolge und Einträge¦Ordem e itens
Player¦Player
Spulen, Intro, Bildformat¦Avanço, intro, formato de imagem
Ton & Untertitel¦Áudio e legendas
Sprachen, Untertitel-Stil¦Idiomas, estilo de legenda
Genres & Kategorien¦Gêneros e categorias
Automatisch oder vom Anbieter¦Automático ou do provedor
Live-TV & Guide¦TV ao vivo e guia
TV-Programm, Favoriten¦Programação da TV, favoritos
Playlists¦Playlists
Verwalten, Aktualisieren¦Gerenciar, atualizar
Jugendschutz¦Controle parental
PIN, Inhalte ab 18¦PIN, conteúdo adulto
Speicher¦Armazenamento
Cache, Verlauf, Fortsetzen¦Cache, histórico, continuar
Diagnose¦Diagnóstico
Status und Fehlersuche¦Status e solução de problemas
Über NexTV¦Sobre o NexTV
Version, Quellen, Zurücksetzen¦Versão, fontes, redefinir
Wirklich? OK zum Bestätigen¦Tem certeza? OK para confirmar
‹ Zurück¦‹ Voltar
Automatisch (Gerät)¦Automático (aparelho)
Sprache der App¦Idioma do app
Alle Menüs und Hinweise erscheinen in dieser Sprache. Beschreibungen, Besetzung und Titel-Infos kommen von TMDB und werden in derselben Sprache geladen, sobald du einen Titel öffnest. Namen von Sendern, Filmen und Kategorien stammen von deinem Anbieter und bleiben unverändert.¦Todos os menus e avisos aparecem neste idioma. Descrições, elenco e informações dos títulos vêm do TMDB e são carregados no mesmo idioma quando você abre um título. Nomes de canais, filmes e categorias vêm do seu provedor e não mudam.
Uhrzeit¦Hora
Zeitformat¦Formato de hora
24 Stunden (14:30)¦24 horas (14:30)
12 Stunden (2:30 PM)¦12 horas (2:30 PM)
Zeitzone¦Fuso horário
Systemzeit (Gerät: {0})¦Hora do sistema (aparelho: {0})
Uhrzeit jetzt¦Hora atual
Gilt für alle Uhrzeiten, zum Beispiel im TV-Guide und in der Live-TV-Infoleiste. „Systemzeit“ nutzt die Einstellung deines Geräts. Zeigt die App Uhrzeiten falsch an, steht dein Fernseher vermutlich auf UTC; wähle dann hier deine Zeitzone.¦Vale para todas as horas, por exemplo no guia de TV e na barra de informações da TV ao vivo. “Hora do sistema” usa a configuração do seu aparelho. Se o app mostra horas erradas, sua TV provavelmente está em UTC; escolha seu fuso horário aqui.
PIN eingeben¦Digite o PIN
Die Jugendschutz-Einstellungen sind mit einer PIN geschützt.¦As configurações de controle parental são protegidas por um PIN.
Falsche PIN¦PIN incorreto
Neue PIN festlegen¦Definir um novo PIN
Wähle eine 4-stellige PIN.¦Escolha um PIN de 4 dígitos.
PIN bestätigen¦Confirmar PIN
Gib die PIN noch einmal ein.¦Digite o PIN de novo.
Die PINs stimmen nicht überein¦Os PINs não conferem
Inhalte für Erwachsene ausblenden¦Ocultar conteúdo adulto
Blendet Kategorien und Titel mit Begriffen wie XXX, Adult oder 18+ in der ganzen App aus: Startseite, Suche, Listen und Live-TV.¦Oculta categorias e títulos com termos como XXX, Adulto ou 18+ em todo o app: página inicial, busca, listas e TV ao vivo.
Der Schutz ist aktiv.¦A proteção está ativa.
{#0} Einträge in deiner Playlist würden ausgeblendet.¦{#0} itens na sua playlist seriam ocultados.
Kein Erwachsenen-Inhalt erkannt.¦Nenhum conteúdo adulto detectado.
PIN¦PIN
PIN ist gesetzt¦PIN definido
Keine PIN gesetzt¦Nenhum PIN definido
PIN ändern¦Alterar PIN
PIN festlegen¦Definir PIN
PIN entfernen¦Remover PIN
Mit einer PIN lässt sich der Schutz nur nach Eingabe der PIN ändern. Die Erkennung arbeitet mit Stichwörtern in Kategorie- und Titelnamen und ist kein vollständiger Filter. Beim Zurücksetzen aller Einstellungen bleibt die PIN erhalten.¦Com um PIN, a proteção só pode ser alterada depois de digitar o PIN. A detecção usa palavras-chave nos nomes de categorias e títulos e não é um filtro completo. Ao redefinir todas as configurações, o PIN é mantido.
Start¦Início
Beim Einschalten des Geräts öffnen¦Abrir quando o aparelho ligar
NexTV startet automatisch, sobald der Fernseher oder die Box hochgefahren ist.¦O NexTV abre automaticamente assim que a TV ou o aparelho ligar.
Berechtigung erteilt¦Permissão concedida
Berechtigung „Über anderen Apps einblenden“ fehlt¦Falta a permissão “Exibir sobre outros apps”
Einstellung öffnen¦Abrir configuração
Prüfen¦Verificar
Ab Android 10 erlaubt das System den Autostart nur mit dieser Berechtigung. Manche Geräte (z. B. einzelne Fire-TV-Modelle) blockieren den Autostart trotzdem; das kann die App nicht ändern.¦A partir do Android 10, o sistema só permite o início automático com essa permissão. Alguns aparelhos (ex.: certos modelos de Fire TV) bloqueiam o início automático mesmo assim; o app não pode mudar isso.
Suche¦Buscar
Startseite¦Página inicial
Diese Seite öffnet sich beim Start der App. Versteckte Menüpunkte sind nicht wählbar.¦Esta página abre quando o app inicia. Itens de menu ocultos não podem ser escolhidos.
Letzten Sender beim Start abspielen¦Reproduzir o último canal ao iniciar
Wenn du zuletzt Live TV gesehen hast, läuft dieser Sender direkt nach dem Start.¦Se você assistiu TV ao vivo por último, esse canal toca logo depois do início.
Bedienung¦Controles
Beenden bestätigen¦Confirmar saída
Auf der Startseite muss „Zurück“ zweimal gedrückt werden, damit die App nicht aus Versehen schließt.¦Na página inicial, “Voltar” precisa ser pressionado duas vezes para o app não fechar sem querer.
Dieses Gerät bietet die Einstellung nicht an. Autostart funktioniert evtl. trotzdem.¦Este aparelho não oferece essa configuração. O início automático pode funcionar mesmo assim.
Zwischenspeicher¦Cache
Leeren¦Limpar
Gesamt¦Total
Geleerte Daten lädt die App bei Bedarf neu. Titel-Infos und Bilder erscheinen danach kurz später. Der Playlist-Zwischenspeicher macht den Start schnell; ohne ihn wartet die App auf den Download.¦O app recarrega os dados apagados quando precisar. Informações dos títulos e imagens aparecem um pouco depois. O cache da playlist deixa o início rápido; sem ele, o app espera o download.
Verlauf¦Histórico
Suchverlauf löschen¦Limpar histórico de busca
Zuletzt geschaut löschen¦Limpar vistos recentemente
Weiterschauen löschen¦Limpar continuar assistindo
Meine Liste und Favoriten bleiben immer erhalten.¦Minha lista e favoritos são sempre mantidos.
Filme, Serien und Sender¦Filmes, séries e canais
Raster zeigt viele Titel auf einmal. Kino zeigt oben die Details zum markierten Titel und unten eine Reihe zum Durchblättern.¦A grade mostra muitos títulos de uma vez. O cinema mostra em cima os detalhes do título selecionado e embaixo uma fileira para navegar.
Spalten (Raster)¦Colunas (grade)
Zeilen (Raster)¦Linhas (grade)
Banner wechselt¦O banner muda
nie¦nunca
alle {#0} s¦a cada {#0} s
Kartengröße (Reihen)¦Tamanho do cartão (fileiras)
Kategorien-Ansicht¦Visualização de categorias
Liste mit Vorschau¦Lista com prévia
Das Raster kannst du zusätzlich direkt in der Rasteransicht mit dem Raster-Knopf ändern.¦Você também pode mudar a grade direto na visualização de grade, com o botão de grade.
Verschiebe Einträge mit den Pfeil-Knöpfen oder blende sie aus. Start und Einstellungen bleiben immer sichtbar.¦Mova itens com os botões de seta ou oculte-os. Início e Configurações ficam sempre visíveis.
versteckt¦oculto
sichtbar¦visível
Standard-Reihenfolge wiederherstellen¦Restaurar ordem padrão
Sprung links/rechts¦Pular para esquerda/direita
Standard-Bildformat¦Formato de imagem padrão
Intro überspringen anbieten¦Oferecer pular intro
Zeigt bei Serien einen Knopf „Intro überspringen“, wenn Intro-Zeiten bekannt sind.¦Mostra um botão “Pular intro” nas séries quando os tempos de intro são conhecidos.
Stream-Info am Start¦Informações do stream no início
Zeigt kurz Auflösung, Ton und Format beim Abspielen von Filmen und Serien.¦Mostra rapidamente resolução, áudio e formato ao reproduzir filmes e séries.
Steuerleiste ausblenden nach¦Ocultar barra de controles após
Startet die nächste Folge nach dem Abspann von selbst.¦Começa o próximo episódio sozinho depois dos créditos.
Zeigt, um wie viel Uhr der Film voraussichtlich endet.¦Mostra a que horas o filme deve terminar.
Intro automatisch überspringen¦Pular intro automaticamente
Überspringt bekannte Intros ohne Rückfrage.¦Pula intros conhecidos sem perguntar.
Bedienung: OK = Pause, Links/Rechts = Sprung (Halten = weiter springen), mehrere Sprünge werden gesammelt, Zurück beim Spulen = abbrechen, Hoch = Zeitleiste, Runter = Steuerleiste. Intro-Zeiten stammen aus der Community-Datenbank TheIntroDB und gibt es nicht für jede Serie. Die Stream-Info erscheint nur bei Filmen und Serien.¦Controles: OK = pausa, Esquerda/Direita = pular (segurar = continuar pulando), vários pulos são somados, Voltar durante o avanço = cancelar, Para cima = linha do tempo, Para baixo = barra de controles. Os tempos de intro vêm do banco de dados comunitário TheIntroDB e não existem para todas as séries. As informações do stream só aparecem em filmes e séries.
"""
