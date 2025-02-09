class Main {
    static void main(String[] args) {

        def arr = [1, 3, 4, 5, 1, 5, 4]

        println(associativeArray(arr))
    }

    def static associativeArray(def arr) {
        def map = [:]
        for (i in arr) {
            map[i] = map.get(i, 0) + 1
        }

        map
    }
}
