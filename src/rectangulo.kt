

class rectangulo(private var base: Float, private var altura: Float) {
    constructor() : this(base = 40F, altura = 60F)
    constructor(base: Float) : this(base, altura = 40F)

    init{
        if(!validar_positivo(base,altura)){
            throw IllegalArgumentException("La base y la altura deben ser mayor que 0.")
        }
    }

    fun calcular_area(): Float{
        return base * altura
    }

    fun calcular_perimetor(): Float{
        return 2 * (base * altura)
    }
}