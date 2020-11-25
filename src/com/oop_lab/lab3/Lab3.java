/*package com.oop_lab.lab3;

 public class Lab3 {
 public static void main(String[] args) {
 String lorem_ispum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce diam turpis, blandit nec ligula commodo, tincidunt malesuada urna. Quisque posuere augue nec lorem sodales, eu tristique nisi pharetra. Donec molestie dapibus ligula, ut imperdiet ligula faucibus id. Pellentesque vitae ex sit amet libero rutrum egestas vulputate eu nunc. Nunc ullamcorper quam a dolor suscipit fringilla. Vestibulum mauris nisi, rhoncus sed risus eu, bibendum rutrum sem. Ut gravida cursus egestas. Mauris laoreet velit sed nibh semper tincidunt. Vivamus dignissim cursus viverra. Fusce nec augue ante. Ut arcu odio, suscipit vitae magna in, dignissim bibendum eros. In vel lorem cursus nulla luctus pellentesque. Sed eleifend neque urna, et sagittis dui facilisis ac. Aliquam pretium, lorem sit amet lacinia venenatis, orci dolor tincidunt libero, vel gravida mi lorem at neque.\n" +
 "\n" +
 "In pulvinar metus vitae urna venenatis scelerisque. Donec a massa ut mauris pulvinar auctor at ac eros. Nullam eget velit et leo congue venenatis. Nulla nunc diam, ultricies eu varius eu, finibus vitae enim. Mauris ultrices pharetra velit vitae fermentum. Aenean at ultricies nisi. Aliquam sollicitudin ac enim et dapibus. Nunc a sem id dui rutrum pulvinar. Pellentesque porttitor rutrum augue, eget tempus elit aliquam vitae. Aliquam ante sapien, fringilla sed pellentesque scelerisque, rutrum faucibus lorem. Nunc semper sollicitudin ex, non vestibulum arcu molestie at. Donec placerat sit amet arcu sed rutrum.\n" +
 "\n" +
 "Suspendisse eu purus sit amet eros tempus vulputate nec condimentum mauris. Sed vitae placerat odio. Suspendisse ornare nec arcu sit amet sagittis. Ut semper convallis luctus. Vestibulum eu fermentum quam. Ut feugiat dolor nec dui dignissim, at fermentum orci fringilla. Maecenas blandit tempus est et ullamcorper. Aenean pulvinar non sapien facilisis maximus. Sed eget lacus mollis, elementum mi eget, lacinia mauris. Aenean semper odio eget nulla laoreet convallis. Maecenas non nisi pretium, tincidunt sapien dapibus, ultrices nibh.\n" +
 "\n" +
 "Praesent convallis placerat mi, rutrum congue turpis. Phasellus sagittis gravida vulputate. Fusce suscipit lectus non lorem mattis, nec pellentesque augue imperdiet. Aenean in tincidunt nunc. Nam a nisi et ipsum porta posuere. Mauris blandit purus purus, rutrum egestas enim elementum sit amet. Praesent dignissim at purus finibus dapibus. Vestibulum placerat porta dui, eget placerat augue facilisis non. Mauris id dolor non enim fermentum sodales hendrerit ut neque. Fusce varius leo at nisi ultrices pharetra. Maecenas venenatis leo id mauris consectetur efficitur. Vestibulum pellentesque leo id mollis fermentum.\n" +
 "\n" +
 "Nunc finibus, ligula nec gravida ullamcorper, ex est tincidunt lorem, in sodales elit velit non magna. Duis mauris purus, viverra hendrerit justo ut, fermentum tempor lorem. Nunc mauris velit, feugiat vel tortor vitae, dictum condimentum elit. Proin purus nunc, rutrum at imperdiet id, volutpat vel nulla. Mauris lobortis nec quam vel dictum. Curabitur placerat, leo ac fermentum efficitur, ligula eros consequat quam, sed iaculis neque nulla mattis nibh. Etiam ut sapien at sem lacinia rhoncus eu eu quam. Maecenas cursus elementum porttitor. Morbi id tristique sem. Suspendisse orci tellus, accumsan ut convallis sed, malesuada ac erat. Nam sodales pulvinar turpis, at pretium ipsum semper eget. Vestibulum non mi porta, semper leo placerat, pulvinar lectus. Curabitur scelerisque fringilla interdum.";

 System.out.println("Words: " + TextManipulation.countWords(lorem_ispum));
 System.out.println("Sentences: " + TextManipulation.countSentences(lorem_ispum));
 System.out.println("Letters: " + TextManipulation.CalculateLetters(lorem_ispum));
 System.out.println("Vowels: " + TextManipulation.CalculateVowels(lorem_ispum));

 }
 }

 class TextManipulation {

 //basic lvl
 public static int countWords(String input) {
 if (input == null) {
 return 0;
 }
 String[] words = input.split("\\s+");
 return words.length;
 }

 public static int countSentences(String input) {
 if (input == null) {
 return 0;
 }
 String[] sentences = input.split("[!?.:]+");
 return sentences.length;
 }

 public static int CalculateLetters(String input) {
 String[] calcLetters = input.trim().split("\\s+");
 int result = 1;
 for (int i = 0; i < calcLetters.length; i++) {
 result = result + calcLetters[i].length();
 }
 return result;
 }

 public static int[] CalculateVowels(String input) {
 char[] calcVowel = input.toCharArray();

 int vowels = 0;

 for (char i : input) {
 if (i == 'a' || i == 'e' || i == 'o' || i == 'u') {
 vowels++;

 }
 }
 return new int[]{vowels};
 }
 }
} */

