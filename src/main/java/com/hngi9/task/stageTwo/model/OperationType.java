package com.hngi9.task.stageTwo.model;

public enum OperationType {
    ADDITION{
        @Override
        public int apply(int x, int y) {
            return x + y;
        }
    },
    SUBTRACTION{
        @Override
        public int apply(int x, int y) {
            return x - y;
        }
    },
    MULTIPLICATION{
        @Override
        public int apply(int x, int y) {
            return x * y;
        }
    };

    public abstract int apply(int x, int y);
}
