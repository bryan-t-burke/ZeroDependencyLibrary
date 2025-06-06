package models.finance;

import java.util.Objects;

public class Amount {

    // rather than use something like BigDecimal, I've seen various payment APIs use whole number values in the form of a currency's smallest unit
    // ex. $4.58 in USD would be 458 cents.
    private long value;

    private Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    public long getValue() {
        return this.value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object object) {
        if (Objects.isNull(object)) {
            return false;
        }
        if (!object.getClass().equals(this.getClass())) {
            return false;
        }
        Amount compare = (Amount) object;
        if (!this.currency.equals(compare.getCurrency())) {
            return false;
        }
        return this.value == compare.getValue();
    }
}