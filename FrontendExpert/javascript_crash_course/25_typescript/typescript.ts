interface GetterSetter<Key, Value> {
    set: (key: Key, value: Value) => void;
    get: (key: Key) => Value;
    
}

class StringNumGetterSetter implements GetterSetter<string, number> {
    map: Map<string, number> = new Map();

    set(key: string, value: number): void {
        this.map.set(key, value);
    }

    get(key: string): number {
        // error: Typescript: Type 'string | undefined' is not assignable to type 'string'
        // return this.map.get(key);

        // fix; Using the non-null assertion operator to solve the error
        // ie. non-null assertion
        return this.map.get(key)!; // 👈️ non-null assertion
    }
}