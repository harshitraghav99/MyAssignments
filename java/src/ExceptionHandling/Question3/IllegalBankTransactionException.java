package ExceptionHandling.Question3;

class IllegalBankTransactionException extends Exception {
    IllegalBankTransactionException() {
        super("IllegalBankTransferException");
    }
}
