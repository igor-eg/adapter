public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        Double b = (double) arg0;
        Double c = (double) arg1;
        Double r = target.newFormula().addOperand(b).addOperand(c).calculate(Calculator.Operation.SUM).result;
        int roundVal = (int) Math.round(r);
        return roundVal;
    }

    @Override
    public int sub(int arg0, int arg1) {
        Double b = (double) arg0;
        Double c = (double) arg1;
        Double r = target.newFormula().addOperand(b).addOperand(c).calculate(Calculator.Operation.SUB).result;
        int roundVal = (int) Math.round(r);
        return roundVal;
    }


    @Override
    public int mult(int arg0, int arg1) {
        Double b = (double) arg0;
        Double c = (double) arg1;
        Double r = target.newFormula().addOperand(b).addOperand(c).calculate(Calculator.Operation.MULT).result;
        int roundVal = (int) Math.round(r);
        return roundVal;
    }

    @Override
    public int div(int arg0, int arg1) {
        Double b = (double) arg0;
        Double c = (double) arg1;
        Double r = target.newFormula().addOperand(b).addOperand(c).calculate(Calculator.Operation.DIV).result;
        int roundVal = (int) Math.round(r);
        return roundVal;
    }


    @Override
    public int pow(int arg0, int arg1) {

        Double b = (double) arg0;
        Double c = (double) arg1;
        Double r = target.newFormula().addOperand(b).addOperand(c).calculate(Calculator.Operation.POW).result;
        int roundVal = (int) Math.round(r);
        return roundVal;
    }
}
