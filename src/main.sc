require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Старт || sessionResult = "Сценарий начинается отсюда", sessionResultColor = "#143AD1"
        q!: $regex</start>
        image: https://sun9-52.userapi.com/impg/qX70TImxjr-_rCy3Xyb8dXfrlgUIx663zGjiGg/eZYLYraLusU.jpg?size=545x410&quality=96&sign=1908c03e63710dc73511333dfdf7c716&type=album
        a: Привет Здесь Вы можете ознакомиться с артефактами проектов, над которыми я работала 🧠 || htmlEnabled = true, html = "<b>Привет</b> <br><br>Здесь Вы можете ознакомиться с <b>артефактами проектов</b>, над которыми я работала"
        inlineButtons:
            {text: "Логи", url: ""},
            {text: "Чат-бот", url: "https://telegram.me/No1mad1Bot"},
            {text: "Блок-схема, тренировочные фразы и т.д", url: "https://met-mother.ru/season-1/episode-9/"},
            {text: "Сценарий", url: "https://docs.google.com/document/d/1qYrhRSrcMGrD_cAX1Pcl--H_21E7LuVNoNhswtoVbdc/edit?tab=t.0"},
            {text: "Технические вопросы", url: "https://docs.google.com/document/d/1Yzyu6whIKOfe8hsgDWWbEnq8X_poHGo59QUg1dIXJMM/edit?tab=t.0"},
            {text: "Заметки", url: "https://docs.google.com/document/d/1HhrQ9WvGpk-zAcR4UQAJqMjfGycvhzKRQm-CGmgugdg/edit?tab=t.o0a8moq2og4h"},
        intent: /Старт || onlyThisState = false, toState = "/Старт"
        intent: /sys/ru/aimylogic/parting || onlyThisState = false, toState = "/Bye"
        
