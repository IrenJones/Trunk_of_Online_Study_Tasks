
public class PairTest {

	public static void main(String[] args) {
		Pair<Integer, String> pair = Pair.of(1, "hello");
		System.out.println(pair.getFirst()); // 1
		System.out.println(pair.getSecond()); // "hello"

		Pair<Integer, String> pair2 = Pair.of(1, "hello");
		System.out.println(pair.equals(pair2)); // true!
		System.out.println(pair.hashCode() == pair2.hashCode()); // true!
	}

}

class Pair<T, E> {
    
    T i = null;
    E s = null;
    
    private Pair(T i, E s){
        this.i = i;
        this.s = s;
    }
    
    static public<T,E> Pair<T, E> of(T i, E s){
        return new Pair<T,E>(i,s);
    }
    
    public T getFirst(){
        return this.i;
    }
    
    public E getSecond(){
        return this.s;
    }
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Pair other = (Pair) obj;
		if (i == null) {
			if (other.i != null) {
				return false;
			}
		} else if (!i.equals(other.i)) {
			return false;
		}
		if (s == null) {
			if (other.s != null) {
				return false;
			}
		} else if (!s.equals(other.s)) {
			return false;
		}
		return true;
	}
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((i == null) ? 0 : i.hashCode());
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}
}
