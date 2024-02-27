//package ro.ase.cts.s01;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class Calculator {
    public double powerSum() {
        double result = 0.0;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            LinkedList<Double> list = readValues(reader);

            double[] powers = new double[list.size()];
            fillWithValues(powers);

            for(int i = 0; i < list.size(); i++) {
                double currentToPower = toPower(list.get(i), powers[i]);
                list.set(i, currentToPower);
            }

            result = addition(list);
        } catch(Exception err) {
            err.printStackTrace();
        }

        return result;
    }

    private void fillWithValues(double[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.random() * 10;
        }
    }

    private LinkedList<Double> readValues(BufferedReader reader) {
        LinkedList<Double> values = new LinkedList<>();
        try {
            String currentValue = reader.readLine();
            while(!currentValue.isEmpty()) {
                double current = Double.parseDouble(currentValue);
                values.add(current);

                currentValue = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Iterator<Double> iterator = values.iterator();

        System.out.println("The values are:");
        while(iterator.hasNext()) System.out.println(iterator.next());

        return values;
    }

    private double toPower(double value, double power) {
        double initial = value;
        for (int i = 1; i < power; i++) initial *= value;
        return initial;
    }

    private double addition(LinkedList<Double> arr) {
        double result = 0;
        for (double v : arr) result += v;
        return result;
    }
}