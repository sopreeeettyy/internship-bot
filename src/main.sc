require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Старт || sessionResult = "Сценарий начинается отсюда", sessionResultColor = "#143AD1"
        q!: $regex</start>
        image: https://sun9-52.userapi.com/impg/qX70TImxjr-_rCy3Xyb8dXfrlgUIx663zGjiGg/eZYLYraLusU.jpg?size=545x410&quality=96&sign=1908c03e63710dc73511333dfdf7c716&type=album
        a: Привет Здесь Вы можете ознакомиться с артефактами проектов, над которыми я работала 🧠 || htmlEnabled = true, html = "<b>Привет</b> <br><br>Здесь Вы можете ознакомиться с <b>артефактами проектов</b>, над которыми я работала"
        inlineButtons:
            {text: "Логи", url: "https://met-mother.ru/season-1/episode-9/"},
            {text: "NTCN", url: "https://met-mother.ru/season-1/episode-9/"},
            {text: "gdfgdf", url: "https://met-mother.ru/season-1/episode-9/"},
            {text: "ggf", url: "https://met-mother.ru/season-1/episode-9/"},
            {text: "feedf", url: "https://met-mother.ru/season-1/episode-9/"},
            {text: "fedf", url: "https://met-mother.ru/season-1/episode-9/"},
        intent: /Старт || onlyThisState = false, toState = "/Старт"
        intent: /sys/ru/aimylogic/parting || onlyThisState = false, toState = "/Bye"
        
