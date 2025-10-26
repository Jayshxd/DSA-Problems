package com.dsa.problems.daily_leetcode;

public class simpleBankSystem2043 {
    class Bank {
        private long[] balance;

        public Bank(long[] balance) {
            this.balance = balance;
        }

        public boolean transfer(int a1, int a2, long money) {
            if (!isValid(a1) || !isValid(a2) || balance[a1-1] < money) return false;
            balance[a1-1] -= money;
            balance[a2-1] += money;
            return true;
        }

        public boolean deposit(int acc, long money) {
            if (!isValid(acc)) return false;
            balance[acc-1] += money;
            return true;
        }

        public boolean withdraw(int acc, long money) {
            if (!isValid(acc) || balance[acc-1] < money) return false;
            balance[acc-1] -= money;
            return true;
        }

        private boolean isValid(int acc) {
            return acc >= 1 && acc <= balance.length;
        }
    }

}
