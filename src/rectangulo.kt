

class rectangulo(val base: Float, val altura: Float) {
    constructor() : this(base = 40F, altura = 60F)
    constructor(base: Float) : this(base, altura = 40F)

    init{
        if(!validar_positivo(base,altura)){
            throw IllegalArgumentException("La base y la altura deben ser mayor que 0.")
        }
    }

    fun calcular_area(): String{
        val area = base * altura
        return "El área de este rectángulo es: $area"
    }

    fun calcular_perimetro(): String{
        val perimetro  = 2 * (base * altura)
        return "El perímetro de este rectángulo es: $perimetro"
    }
    override fun toString(): String {
        return "Rectangulo: base: ${this.base} altura: ${this.altura} "
    }

}