package com.jkdajac.listofnews


import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profiles = getProfiles()
        rvUsers.adapter = ProfilesAdapter(profiles, this,)
        rvUsers.layoutManager = LinearLayoutManager(this)
    }
    private fun getProfiles(): ArrayList<Profile>{
        val profiles = ArrayList<Profile>()
        profiles.add(Profile(
            "Подросток дважды взломал Apple надеясь, что получит работу в компании",
            "Школьнику Аделаиды, который взломал защищенную компьютерную систему Apple," +
                    " когда ему было всего 13 лет, настоятельно рекомендуется использовать " +
                    "его «значительный талант» во благо вместо зла.",
            BitmapFactory.decodeResource(resources, R.drawable.apple),
                    BitmapFactory.decodeResource(resources, R.drawable.heartlike)
        ))
        profiles.add(Profile(
            "Поезда с приставкой хай-тек собирают под Дзержинском",
            "Это составы нового поколения и отечественной разработки  с умной начинкой," +
                    "а также всеми необходимыми функциями: от климат-контроля - до  USB-портов для зарядки " +
                    "смартфонов." +
                    "А первые пассажиры уже оценили и плавность хода.",
            BitmapFactory.decodeResource(resources, R.drawable.train),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))
        profiles.add(Profile(
            "Сотовая связь 6G появиться в России в 2035 году",
            "Шестое поколение сотовой связи (6G) может появиться в России в 2035 году. " +
                    "Об этом сообщили в Научно-исследовательском институте радио (НИИР) и " +
                    "Сколковском институте науки и технологий." +
                    "Как рассказал замдиректора научно-технического центра НИИР Евгений Девяткин, " +
                    "институт по заказу Минцифры подготовил проект дорожной карты 6G. " +
                    "Новая сеть будет управляться искусственным интеллектом, " +
                    "а потребители получат доступ к голографическим звонкам и тактильному интернету." +
                    "Кроме того, в 6G можно будет использовать иммерсионную расширенную реальность (XR)," +
                    " которая совмещает виртуальную реальность (VR), дополненную реальность (AR) и " +
                    "смешанную реальность (MR) в сферах развлечений, здравоохранения, науки, образования, " +
                    "промышленности и межличностном общении." +
                    " Пиковая скорость передачи данных в новых сетях сможет достигать и даже превышать 1 Тбит/с. " +
                    "Задержка приложений станет в 40 раз меньше, чем у 5G.",
            BitmapFactory.decodeResource(resources, R.drawable.train),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))
        profiles.add(Profile(
            "В стиле хай-тек: супер-современный “космический” дом в Карпатах ",
            "На одном из склонов Карпатских гор, величественных и неповторимых в своей красоте, " +
                    "покрытыми густыми лесами и хрустально-прозрачными озерами, расположился… нет, " +
                    "не старенький деревянный домик, а супер-современный дом в стиле хай-тек.\n" +
                    "Уникальность дома заключается не только в концептуальном архитектурном решении " +
                    "(согласитесь, в таком ландшафте он чем-то напоминает миниатюрное представительство " +
                    "внеземных цивилизаций), но и в полном автономном энергообеспечении.",
            BitmapFactory.decodeResource(resources, R.drawable.domvkarpatah),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))

        profiles.add(Profile(
            "Хайтек - драйвер роста мировой торговли",
            "Как сообщают новости, экспорт продукции высоких технологий будет повышаться " +
                    "стремительнее, чем экспорт прочих товаров на протяжении ближайших пятнадцати лет " +
                    "— говорят экономисты банка HSBS. Развивающийся азиатский регион будет продвигать " +
                    "собственную продукцию вместо того, чтобы оставаться концентратором мощностей " +
                    "производства зарубежных брендов.\n" +
                    "Высокотехнологичные товары в 2030 году составят около четверти всей выпускаемой " +
                    "мировой продукции. В 2013 году товары хайтек занимали 22% общего объема товарного " +
                    "рынка.\n" +
                    "\n" +
                    "Специалисты HSBC отметили, что будущий расцвет высокотехнологичной торговли будет" +
                    " подкреплен межнациональной цепочкой поставок — то есть запчасти будут " +
                    "поступать из разных частей света. Аналитики полагают, что компаниям из Азии" +
                    " постепенно удастся отвоевать доли у конкурентов из западных стран.\n" +
                    "\n" +
                    "В частности, согласно исследованию, на долю Китая к 2030 году будет приходиться " +
                    "свыше 50% мирового товарооборота высокотехнологичной продукции.",
            BitmapFactory.decodeResource(resources, R.drawable.hand),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))

        profiles.add(Profile(
            "Подросток дважды взломал Apple надеясь, что получит работу в компании",
            "Школьнику Аделаиды, который взломал защищенную компьютерную систему Apple," +
                    " когда ему было всего 13 лет, настоятельно рекомендуется использовать " +
                    "его «значительный талант» во благо вместо зла.",
            BitmapFactory.decodeResource(resources, R.drawable.apple),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))
        profiles.add(Profile(
            "Поезда с приставкой хай-тек собирают под Дзержинском",
            "Это составы нового поколения и отечественной разработки  с умной начинкой," +
                    "а также всеми необходимыми функциями: от климат-контроля - до  USB-портов для зарядки " +
                    "смартфонов." +
                    "А первые пассажиры уже оценили и плавность хода.",
            BitmapFactory.decodeResource(resources, R.drawable.train),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))
        profiles.add(Profile(
            "Сотовая связь 6G появиться в России в 2035 году",
            "Шестое поколение сотовой связи (6G) может появиться в России в 2035 году. " +
                    "Об этом сообщили в Научно-исследовательском институте радио (НИИР) и " +
                    "Сколковском институте науки и технологий." +
                    "Как рассказал замдиректора научно-технического центра НИИР Евгений Девяткин, " +
                    "институт по заказу Минцифры подготовил проект дорожной карты 6G. " +
                    "Новая сеть будет управляться искусственным интеллектом, " +
                    "а потребители получат доступ к голографическим звонкам и тактильному интернету." +
                    "Кроме того, в 6G можно будет использовать иммерсионную расширенную реальность (XR)," +
                    " которая совмещает виртуальную реальность (VR), дополненную реальность (AR) и " +
                    "смешанную реальность (MR) в сферах развлечений, здравоохранения, науки, образования, " +
                    "промышленности и межличностном общении." +
                    " Пиковая скорость передачи данных в новых сетях сможет достигать и даже превышать 1 Тбит/с. " +
                    "Задержка приложений станет в 40 раз меньше, чем у 5G.",
            BitmapFactory.decodeResource(resources, R.drawable.train),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))
        profiles.add(Profile(
            "В стиле хай-тек: супер-современный “космический” дом в Карпатах ",
            "На одном из склонов Карпатских гор, величественных и неповторимых в своей красоте, " +
                    "покрытыми густыми лесами и хрустально-прозрачными озерами, расположился… нет, " +
                    "не старенький деревянный домик, а супер-современный дом в стиле хай-тек.\n" +
                    "Уникальность дома заключается не только в концептуальном архитектурном решении " +
                    "(согласитесь, в таком ландшафте он чем-то напоминает миниатюрное представительство " +
                    "внеземных цивилизаций), но и в полном автономном энергообеспечении.",
            BitmapFactory.decodeResource(resources, R.drawable.domvkarpatah),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))

        profiles.add(Profile(
            "Хайтек - драйвер роста мировой торговли",
            "Как сообщают новости, экспорт продукции высоких технологий будет повышаться " +
                    "стремительнее, чем экспорт прочих товаров на протяжении ближайших пятнадцати лет " +
                    "— говорят экономисты банка HSBS. Развивающийся азиатский регион будет продвигать " +
                    "собственную продукцию вместо того, чтобы оставаться концентратором мощностей " +
                    "производства зарубежных брендов.\n" +
                    "Высокотехнологичные товары в 2030 году составят около четверти всей выпускаемой " +
                    "мировой продукции. В 2013 году товары хайтек занимали 22% общего объема товарного " +
                    "рынка.\n" +
                    "\n" +
                    "Специалисты HSBC отметили, что будущий расцвет высокотехнологичной торговли будет" +
                    " подкреплен межнациональной цепочкой поставок — то есть запчасти будут " +
                    "поступать из разных частей света. Аналитики полагают, что компаниям из Азии" +
                    " постепенно удастся отвоевать доли у конкурентов из западных стран.\n" +
                    "\n" +
                    "В частности, согласно исследованию, на долю Китая к 2030 году будет приходиться " +
                    "свыше 50% мирового товарооборота высокотехнологичной продукции.",
            BitmapFactory.decodeResource(resources, R.drawable.hand),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))


        profiles.add(Profile(
            "Подросток дважды взломал Apple надеясь, что получит работу в компании",
            "Школьнику Аделаиды, который взломал защищенную компьютерную систему Apple," +
                    " когда ему было всего 13 лет, настоятельно рекомендуется использовать " +
                    "его «значительный талант» во благо вместо зла.",
            BitmapFactory.decodeResource(resources, R.drawable.apple),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))
        profiles.add(Profile(
            "Поезда с приставкой хай-тек собирают под Дзержинском",
            "Это составы нового поколения и отечественной разработки  с умной начинкой," +
                    "а также всеми необходимыми функциями: от климат-контроля - до  USB-портов для зарядки " +
                    "смартфонов." +
                    "А первые пассажиры уже оценили и плавность хода.",
            BitmapFactory.decodeResource(resources, R.drawable.train),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))
        profiles.add(Profile(
            "Сотовая связь 6G появиться в России в 2035 году",
            "Шестое поколение сотовой связи (6G) может появиться в России в 2035 году. " +
                    "Об этом сообщили в Научно-исследовательском институте радио (НИИР) и " +
                    "Сколковском институте науки и технологий." +
                    "Как рассказал замдиректора научно-технического центра НИИР Евгений Девяткин, " +
                    "институт по заказу Минцифры подготовил проект дорожной карты 6G. " +
                    "Новая сеть будет управляться искусственным интеллектом, " +
                    "а потребители получат доступ к голографическим звонкам и тактильному интернету." +
                    "Кроме того, в 6G можно будет использовать иммерсионную расширенную реальность (XR)," +
                    " которая совмещает виртуальную реальность (VR), дополненную реальность (AR) и " +
                    "смешанную реальность (MR) в сферах развлечений, здравоохранения, науки, образования, " +
                    "промышленности и межличностном общении." +
                    " Пиковая скорость передачи данных в новых сетях сможет достигать и даже превышать 1 Тбит/с. " +
                    "Задержка приложений станет в 40 раз меньше, чем у 5G.",
            BitmapFactory.decodeResource(resources, R.drawable.train),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))
        profiles.add(Profile(
            "В стиле хай-тек: супер-современный “космический” дом в Карпатах ",
            "На одном из склонов Карпатских гор, величественных и неповторимых в своей красоте, " +
                    "покрытыми густыми лесами и хрустально-прозрачными озерами, расположился… нет, " +
                    "не старенький деревянный домик, а супер-современный дом в стиле хай-тек.\n" +
                    "Уникальность дома заключается не только в концептуальном архитектурном решении " +
                    "(согласитесь, в таком ландшафте он чем-то напоминает миниатюрное представительство " +
                    "внеземных цивилизаций), но и в полном автономном энергообеспечении.",
            BitmapFactory.decodeResource(resources, R.drawable.domvkarpatah),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))

        profiles.add(Profile(
            "Хайтек - драйвер роста мировой торговли",
            "Как сообщают новости, экспорт продукции высоких технологий будет повышаться " +
                    "стремительнее, чем экспорт прочих товаров на протяжении ближайших пятнадцати лет " +
                    "— говорят экономисты банка HSBS. Развивающийся азиатский регион будет продвигать " +
                    "собственную продукцию вместо того, чтобы оставаться концентратором мощностей " +
                    "производства зарубежных брендов.\n" +
                    "Высокотехнологичные товары в 2030 году составят около четверти всей выпускаемой " +
                    "мировой продукции. В 2013 году товары хайтек занимали 22% общего объема товарного " +
                    "рынка.\n" +
                    "\n" +
                    "Специалисты HSBC отметили, что будущий расцвет высокотехнологичной торговли будет" +
                    " подкреплен межнациональной цепочкой поставок — то есть запчасти будут " +
                    "поступать из разных частей света. Аналитики полагают, что компаниям из Азии" +
                    " постепенно удастся отвоевать доли у конкурентов из западных стран.\n" +
                    "\n" +
                    "В частности, согласно исследованию, на долю Китая к 2030 году будет приходиться " +
                    "свыше 50% мирового товарооборота высокотехнологичной продукции.",
            BitmapFactory.decodeResource(resources, R.drawable.hand),
            BitmapFactory.decodeResource(resources, R.drawable.heartlikewhite)
        ))
        
        return profiles

    }
}