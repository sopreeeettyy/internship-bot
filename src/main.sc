require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Старт || sessionResult = "Сценарий начинается отсюда", sessionResultColor = "#143AD1"
        q!: $regex</start>
        image: https://allfest.ru/sites/default/files/styles/af_1200x798/public/2023-09/dvizh-fest.jpg?itok=aJKNaHii
        a: Привет!Здесь Вы можете ознакомиться с артефактами проектов, над которыми я работала 🧠 || htmlEnabled = true, html = "<b>Привет!</b> <br><br>Здесь Вы можете ознакомиться с артефактами проектов, над которыми я работала 🧠</b>"
        inlineButtons:
            {text: "Логи", url: "https://met-mother.ru/season-1/episode-9/"},
            {text: "NTCN", url: "https://met-mother.ru/season-1/episode-9/"},
            {text: "gdfgdf", url: "https://met-mother.ru/season-1/episode-9/"},
            {text: "ggf", url: "https://met-mother.ru/season-1/episode-9/"},
            {text: "feedf", url: "https://met-mother.ru/season-1/episode-9/"},
            {text: "fedf", url: "https://met-mother.ru/season-1/episode-9/"},
        intent: /Старт || onlyThisState = false, toState = "/Старт"
        intent: /sys/ru/aimylogic/parting || onlyThisState = false, toState = "/Bye"
        
