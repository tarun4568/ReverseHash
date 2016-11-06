//Pseudo Code to reverse hash

Int64 hash_r (String s, int x) {
     if (x < 0)
          return 7
     return hash_r(s, x-1) * 37 + letters.indexOf(s[x])
}

//Working Code

String reverse_hash (Int64 hash, String letters) {
     int remainder = hash % 37;
     hash = (hash-remainder)/37;
     if (hash == 7) // base case
          return “”;
     return reverse_hash(hash, letters) + letters[remainder];
}