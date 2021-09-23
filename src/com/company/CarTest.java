package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
/*
    Car car;

    @BeforeEach
    public void createCar(){
        car=new Car("Shkoda","ABC-1234",2019,"Nikolaev");
    }

    @Test
    void getManufacturer() {
        assertEquals("Shkoda", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("ABC-1234", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("ABC-1111");
        assertEquals("ABC-1111", car.getNumber());
    }

    @ParameterizedTest
    @ValueSource(strings = {"ABC-123", "RET-432", "RRT-433"})   // в тестовый метод может подавать только один параметр
    @NullSource
    @EmptySource    //same ad ""
    void testSetNumberMultipleValues(String number){
        car.setNumber(number);
        assertEquals(number, car.getNumber());
    }

    @ParameterizedTest
    @CsvSource({"'ABC-123', 'ABC-123'",
    "'FSE-344', 'FSE-344'"})       // несколько параметров
    void testSetNumberMultipleValues(String number, String x){
        car.setNumber(number);
        assertEquals(x, car.getNumber());
    }

    @ParameterizedTest
    @CsvSource({"1, 5",
            "-2, 2",
            "0, 4"})       // несколько параметров
    void testIntMultipleValues(int input, int output){
        assertEquals(car.testInt(input), output);
    }

    @Test
    void getYear() {
        assertEquals(2019, car.getYear());
    }

    @Test
    void getOwner() {
        assertEquals("Nikolaev", car.getOwner());
    }


    @Test
    void setOwner() {
        car.setOwner("Malik");
        assertEquals("Malik",car.getOwner());
    }

    @Test
    void getOwnerList() {
        assertArrayEquals(new String[]{"Nikolaev"},car.getOwnerList().toArray());
    }

    @Test
    void getOwnerListAdded() {
        car.setOwner("Malik");
        assertArrayEquals(new String[]{"Nikolaev","Malik"},car.getOwnerList().toArray());
    }

    @Test
    void testPrivateMethod(){
        try{
            Method method = Car.class.getDeclaredMethod("testMethod", null);

            method.setAccessible(true);
            assertEquals("abc", method.invoke(car).toString());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    void testPrivateMethodArgument(){
        try{
            Method method = Car.class.getDeclaredMethod("testMethod", String.class);

            method.setAccessible(true);
            assertEquals("hello", method.invoke(car,"hello").toString());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    void testConsole() {
        String consoleOutput=null;
        PrintStream originalOut = System.out;

        try{
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(100);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);

            car.console();

            capture.flush();
            consoleOutput = outputStream.toString();
            System.setOut(originalOut);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        assertEquals("hi\r\n", consoleOutput);
    }

    @ParameterizedTest
    @DisplayName("Test demonstrates how test data could be loaded from file")
    @CsvFileSource(resources = "/com/company/test-data.csv", delimiter = '|', numLinesToSkip = 1)
    public void testDataFromFile(String input, String expected){
        car.setNumber(input);
        assertEquals(expected, car.getNumber());
    }
*/

    // параллельное выполнение(параметры в конфиге)((либо везде указываем анотацию))
    @Test
    //@Execution(ExecutionMode.CONCURRENT)
    void getCarYear() {
        Car car = new Car("BMW", "222-eee", 2020, "Nikolaev");
        assertEquals(2020, car.getYear());
    }

    @Test
    //@Execution(ExecutionMode.CONCURRENT)
    void getCarManuf() {
        Car car = new Car("BMW", "222-eee", 2020, "Nikolaev");
        assertEquals("BMW", car.getManufacturer());
    }

    @Test
   //@Execution(ExecutionMode.CONCURRENT)
    void getCarNumber() {
        Car car = new Car("BMW", "222-eee", 2020, "Nikolaev");
        assertEquals("222-eee", car.getNumber());
    }



}