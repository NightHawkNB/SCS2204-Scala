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

    var data = "ABCD EFGH"

    println("Starting String : " + data)

    println("After Encryption : " + encrypt(data))
    println("After Decryption : " + decrypt(encrypt(data)))
    println("Using the cipher Function for encryption : " + cipher(data, encrypt))
    println("Using the cipher Function for decryption : " + cipher(encrypt(data), decrypt))
}