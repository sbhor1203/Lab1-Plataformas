class ItemData(val originalvalue:Any) {

    fun getType():String?{
        return when (originalValue) {
            is String -> return "cadena"
            is Int -> return "entero"
            is Boolean -> return "booleano"
            else ->  return null
        }
    }

    fun getInfo(): String? {
        return when (originalValue) {
            is String -> "L${originalValue.length}"
            is Int -> {
                when {
                    originalValue % 10 == 0 -> "M10"
                    originalValue % 5 == 0 -> "M5"
                    originalValue % 2 == 0 -> "M2"
                    else -> null
                }
            }
            is Boolean -> if (originalValue.toString().toBoolean()) return "Verdadero" else "Falso"
            else -> return null
        }



}
    }


