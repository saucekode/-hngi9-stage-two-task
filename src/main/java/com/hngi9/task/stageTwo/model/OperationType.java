package com.hngi9.task.stageTwo.model;

public enum OperationType {
    addition{
        @Override
        public int apply(int x, int y) {
            return x + y;
        }
    },
    subtraction{
        @Override
        public int apply(int x, int y) {
            return x - y;
        }
    },
    multiplication{
        @Override
        public int apply(int x, int y) {
            return x * y;
        }
    };

    public abstract int apply(int x, int y);
}
