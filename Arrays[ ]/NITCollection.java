// Custom Collection Development
// Developing Our Own ArrayList
// ==========================
public class NITCollection {
 private Object[]  elementData;
 private int  elementCount;
 public NITCollection() {
 elementData = new Object[10]; 
 }
 public void add(Object obj) {
 if(size() == capacity()) {
 grow();
 }
 elementData[elementCount] = obj;
 elementCount++;
 }
 private void grow() {
 Object[] nextArray = new Object[capacity() * 2];
 for(int i=0; i<elementData.length; i++) {
 nextArray[i] = elementData[i];
 }
 elementData = nextArray;
 }
 public int capacity() {
 return elementData.length;
 }
 public int size() {
 return elementCount;
 }
 public boolean contains(Object obj) { //linear search algorithm
 return indexOf(obj)>=0;
 }
 public int indexOf(Object obj) {
 if(obj == null) {
 for(int i=0; i<elementCount; i++) {
 if(elementData[i] == null) {
 return i;
 }
 }
 return -1;
 }
 else {
 for(int i=0; i<elementCount; i++) {
 if(obj.equals(elementData[i])) {
 return i;
 }
 }
 return -1;
 }
 }
 public int lastIndexOf(Object obj) {
 if(obj == null) {
 for(int i=elementCount-1; i>=0; i--) {
 if(elementData[i] == null) {
 return i;
 }
 }
 return -1;
 }
 else {
 for(int i=elementCount-1; i>=0; i--) {
 if(obj.equals(elementData[i])) {
 return i;
 }
 }
 return -1;
 }
 }
 public Object get(int index) {
 checkIndex(index);
 return elementData[index];
 }
 private void checkIndex(int index) {
 if(index <0 || index>=elementCount)
 throw new IndexOutOfBoundsException(index); 
 }
 public Object remove(int index) {
 checkIndex(index);
 Object ele = elementData[index];
 for(; index<elementCount-1; index++) {
 elementData[index] = elementData[index+1];
 }
 elementData[elementCount-1] = null;
 elementCount--; 
 return ele;
 }
 public boolean remove(Object obj) {
 int index = indexOf(obj);
 if(index ==-1)
 return false;
 remove(index); 
 return true;
 }
 public void add(int index, Object obj) {
 if(index<0 || index>elementCount) //we can consider index up to size
 throw new IndexOutOfBoundsException(index);
 if(size() == capacity())  //growing capacity to insert element
 grow();
 for(int i=elementCount-1; i>=index; i--) {  //moving elements 
 elementData[i+1] = elementData[i];        //size to up to passed index
 }
 elementData[index] = obj;   //inserting argument object in the given location
 elementCount++;           //increasing size
 }
 public Object set(int index, Object obj) {
 checkIndex(index);
 Object ele = elementData[index];
 elementData[index] = obj;
 return ele;
 }
 @Override
 public String toString() {
 StringBuilder stringBuilder = new StringBuilder();
 stringBuilder.append("[");
 for(int i=0; i<size(); i++) {
 stringBuilder.append(elementData[i]);
 stringBuilder.append(", ");
 }
 int start = stringBuilder.lastIndexOf(", ");
 if(start != -1) {
 int end = start + 2;
 stringBuilder.delete(start, end);
 }
 stringBuilder.append("]");
 return stringBuilder.toString();
 }
}
