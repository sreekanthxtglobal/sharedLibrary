public class Calculator{

def jenkins;

Calculator(jenkins){
    this.jenkins=jenkins;
}

def add(firstNumber,secondNumber){
    echo "Added Numbers ${firstNumber+secondNumber}"
}


def mul(firstNumber,secondNumber){
   echo "Mul  Numbers ${firstNumber*secondNumber}"
}

}