object cipher_code extends App{
    
    def encrypt(word: String, cipher:Int = 1): String = {
        var charArray = word.toCharArray();
        var output = ""

        for(letter <- charArray) output = output.concat((letter+1).toChar.toString)

        output
    }

    def decrypt(word: String, cipher:Int = 1): String = {
        var charArray = word.toCharArray();
        var output = ""

        for(letter <- charArray) output = output.concat((letter-1).toChar.toString)

        output
    }

    def cipher(data: String, func: (String, Int) => String, cipher:Int = 1): String = {
        func(data, cipher)
    }

    println("Starting String : 'ABCD EFGH'")

    println("After Encryption : " + encrypt("ABCD EFGH"))
    println("After Decryption : " + decrypt(encrypt("ABCD EFGH")))
    println("Using the cipher Function for encryption : " + cipher("ABCD EFGH", encrypt))
    println("Using the cipher Function for decryption : " + cipher(encrypt("ABCD EFGH"), decrypt))
}