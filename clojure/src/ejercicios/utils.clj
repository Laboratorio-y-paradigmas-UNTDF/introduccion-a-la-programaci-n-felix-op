(ns ejercicios.utils)

;; ================================================================
;; Funciones Auxiliares Reutilizables
;; ================================================================

(ns ejercicios.utils)

;; ================================================================
;; Funciones Auxiliares Reutilizables
;; ================================================================

(defn mayor0?
  "Verifica si un número es par.
   
   (par? 2)  => true
   (par? 3)  => false
   (par? 0)  => true
   (par? -4) => true"
  [n]
  (> n 0))

(defn par?
  "Verifica si un número es par.
   
   (par? 2)  => true
   (par? 3)  => false
   (par? 0)  => true
   (par? -4) => true"
  [n]
  (zero? (mod n 2)))

(defn impar?
  "Verifica si un número es impar.
   
   (impar? 2)  => false
   (impar? 3)  => true
   (impar? 0)  => false
   (impar? -5) => true"
  [n]
  (not (par? n)))

(defn doble
  "Multiplica un número por 2.
   
   (doble 5)  => 10
   (doble -3) => -6"
  [n]
  (* 2 n))

(defn cuadrado
  "Eleva un número al cuadrado.
   
   (cuadrado 3) => 9
   (cuadrado 5) => 25"
  [n]
  (* n n))

(defn divisible?
  "Verifica si n es divisible por divisor.
   
   (divisible? 10 2)  => true
   (divisible? 10 3)  => false
   (divisible? 15 5)  => true"
  [n divisor]
  (zero? (mod n divisor)))

(defn maximo
  "Obtiene el máximo de 2 elementos"
  
  [a b]
  (if (> a b) a b)
)

(defn append
  "Obtiene el máximo de 2 elementos"
  
  [coll a]
  (cons a coll)
)

(defn minmax
  "Reemplaza el mímimo y el maximo en cada elemento de un mapa"
  
  [mapa num]
  {
    :min (min (:min mapa) num)
    :max (max (:max mapa) num)
  }
)