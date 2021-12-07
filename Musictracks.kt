class Musicplayer {

     var songs:Array<String> = arrayOf()

    fun show() {
        for (item in songs){
            println(item)
        }
    }

    fun play() {
        for (item in songs)
        {
            println("Playing "+item)
        }
    }

    fun add(trackName: String) {
            songs+=trackName
    }

}

fun main(args: Array<String>) {
    val m = Musicplayer()
    while(true) {
        println("\nEnter any options below :\n1.Add a track\n2.Show all the tracks\n3.Play a track\n4.Exit")



        var input = readLine()!!

        if (input == "1") {
            println("\nEnter the name of Track\n")
            var track_name:String = readLine()!!
            m.add(track_name)
        }

        if (input == "2") {
            println("\nAll the tracks that we have :")
            m.show()
        }
        if (input == "3") {
            m.play()
        }
        if (input == "4") {
            break
        }
    }
}
