function sum(...values) {
    let total = 0

    for (const value of values) {
        total += value;
    }

    return total
}

console.log(sum(1,2,3,4,5))


const getEmail = () => 'thiago.mikis@gmail.com'
const getSenha = () => '0987654321'

const sayHello = (user) => `Username: ${user}`

/**
 * @description Sum two values...
 * @param {Number} a first value to be sum
 * @param {Number} b second value to be sum
 * @returns {Number} poqwekpqepoqkweopkqpeq
 */

function sum(a, b) {
    if (typeof a === "number" && typeof b === "number") {
      return a + b;
    }
  
    throw new Error("Você passou um parâmetro que não é number.");
  }
  
  const sum1 = function (a, b) {
    return a + b;
  };
  
  const sum2 = (a, b, c) => {
    return a + b + c;
  };
  
  const sum3 = (a, b, c, d) => a + b + c + d;
  
  (() => {
    console.log("Anonymous Function");
  })();
  
  // const totalSum1 = sum(456, function () {});
  // const totalSum2 = sum(456, () => {});
  
  // console.log(totalSum);

  function operacaoMatematica(operacao, a, b) {
    return operacao(a, b);
    }
    
    
    function soma(a, b) {
    return a + b;
    }
    
    
    function subtracao(a, b) {
    return a - b;
    }
    
    
    console.log(operacaoMatematica(soma, a, b));
    console.log(operacaoMatematica(subtracao, a, b));