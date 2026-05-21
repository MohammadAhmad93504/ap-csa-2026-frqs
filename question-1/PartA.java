public Account(String requestedName) {
      username = requestedName;
      int i = 1;
      while (!isAvailable(username)) {
          username = requestedName + i;
          i++;
      }
}
