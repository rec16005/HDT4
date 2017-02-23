import org.junit;

@Test
public void testSuma(){
  Calculadora c = new Calculadora;
  double resultado = test.suma(1, 4);
  assertEquals(5, resultado);
}

@Test
public void testResta(){
  Calculadora c = new Calculadora;
  double resultado = test.resta(4, 3);
  assertEquals(1, resultado);
}

@Test
public void testMultiplicacion(){
  Calculadora c = new Calculadora;
  double resultado = test.multiplicacion(2, 4);
  assertEquals(8, resultado);
}

@Test
public void testDivision(){
  Calculadora c = new Calculadora;
  double resultado = test.division(6, 3);
  assertEquals(2, resultado);
}

@Test
public void testOperar(){
  Calculadora c = new Calculadora;
  double resultado = test.operar(1, 4);
  assertEquals(5, resultado);
}
