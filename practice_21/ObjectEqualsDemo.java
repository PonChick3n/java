class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {

        // 1. Проверка на сравнение с самим собой
        if (this == obj) return true;

        // 2. Проверка на null и на совпадение классов
        if (obj == null || this.getClass() != obj.getClass()) return false;

        // 3. Приведение типа
        Point other = (Point) obj;

        // 4. Логическое сравнение значимых полей
        return this.x == other.x && this.y == other.y;
    }
}