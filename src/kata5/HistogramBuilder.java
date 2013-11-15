package kata5;


public class HistogramBuilder<T>{
    
    private T[] items;

    public HistogramBuilder(T[] items) {
        this.items = items;
    }
    
    public <A> Histogram<A> build(AttributeExtractor<T, A> extractor){
        Histogram<A> histogram = new Histogram<>();
        for (T item : items) {
            A attribute = extractor.extract(item);
            histogram.put(attribute, histogram.get(attribute) + 1);
        }
        return histogram;
    }    
}
