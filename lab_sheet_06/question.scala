object cipher_code extends App{
    
    def encrypt(word: String, cipher:Int = 1): String = {
        var charArray = word.toCharArray();
        var output = ""
        var letter_02 = 0

        for(letter <- charArray) {
            if(letter == 32) {
                output = output.concat(" ")
            } else if(letter >= 65 && letter <= 90) {
                letter_02 = letter+cipher
                if(letter_02 > 90) {
                    output = output.concat((letter_02-26).toChar.toString)
                }else{
                    output = output.concat(letter_02.toChar.toString)
                }
            } else if(letter >= 96 && letter <= 122) {
                letter_02 = letter+cipher
                if(letter_02 > 122) {
                    output = output.concat((letter_02-26).toChar.toString)
                } else {
                    output = output.concat(letter_02.toChar.toString)
                }
            }
            
        }

        output
    }

    def decrypt(word: String, cipher:Int = 1): String = {
        var charArray = word.toCharArray();
        var output = ""
        var letter_02 = 0

        for(letter <- charArray) {
            if(letter == 32) {
                output = output.concat(" ")
            }else if(letter >= 65 && letter <= 90) {
                letter_02 = letter-cipher
                if(letter_02 < 65) {
                    output = output.concat((letter_02+26).toChar.toString)
                } else {
                    output = output.concat(letter_02.toChar.toString)
                }
            }   
            else if(letter >= 96 && letter <= 122) {
                letter_02 = letter-cipher
                if(letter_02 < 96) {
                    output = output.concat((letter_02+26).toChar.toString)
                } else {
                    output = output.concat(letter_02.toChar.toString)
                }
            }    
        }

        output
    }

    def cipher(data: String, func: (String, Int) => String, cipher:Int = 1): String = {
        func(data, cipher)
    }

    var data = "cat"

    println("Starting String : " + data)

    println("After Encryption : " + encrypt(data))
    println("After Decryption : " + decrypt(encrypt(data)))
    println("Using the cipher Function for encryption : " + cipher(data, encrypt))
    println("Using the cipher Function for decryption : " + cipher(encrypt(data), decrypt))
}