export function redondear(value: number, decimales: number) {
    const exp = Math.pow(10, decimales);
    return (value * exp) / exp;
}

export function sumar<T>(array: T[], fn: (value: T) => number): number {
    return array.reduce((acc, value) => {
        return acc + fn(value);
    }, 0);
}

export function sumarEnteros(array: number[]): number {
    return sumar(array, (a) => a);
}

export function promedio<T>(array: T[], fn: (value: T) => number): number {
    if (array.length===0) return 0;
    return sumar(array, fn) / array.length;
}

export function promedioEnteros(array: number[]): number {
    if (array.length===0) return 0;
    return sumarEnteros(array) / array.length;
}