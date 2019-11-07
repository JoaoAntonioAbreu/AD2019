/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Turma A
 */
public class Rational implements Comparable<Rational> {

    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Rational other = (Rational) obj;
        return denominator == other.denominator && numerator == other.numerator;
    }

    @Override
    public int compareTo(Rational t) {
        return getNumerator() * t.getDenominator()
                - t.getNumerator() * getDenominator();
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

   // List<Rational> racionais = new ArrayList<Rational>();

}
