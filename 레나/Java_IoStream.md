# I/O streams in Java

- Stream: 네트워크에서 유래된 용어. 자료 흐름이 물의 흐름과 같다는 의미. 즉 자료를 읽어 들인다는 의미.

- InputStream: FileInputStream, FileReader, BufferedInputStream, BufferedReader 등 있음.
- OutputStream: FileOutputStream, FileWriter, BufferedoutputStream, BufferedWriter 등 있음.

- Byte Stream: FileInputStream, FileOutputStream, BufferedInputStream, BufferedOutputStream등이 있음 // 그림이나 영상 등을 받을 때 Byte로 받음
- Character Stream: FileReader, FileWriter, BufferedReader, BufferedWriter 등 // 한글같은 거는 2Byte 받아야해서 Byte Stream 사용하면 깨짐

- 보조 스트림: InputStreaReader, OutputStreamWriter, BufferedInputStream, BufferedOutputStream 등

- FileInputStream: 파일에서 바이트 단위로 자료를 읽는다.
- int read(): 입력 스트림으로부터 한 바이트의 자료를 읽는다. 읽은 자료의 바이트 수를 반환함.
- int read(byte b[]): 입력 스트림으로부터 b[] 크기의 자료를 b[]에 읽음. 읽은 자료의 바이트 수를 반환.
- int read(byte b[],int off,int len): 입력 스트림으로부터 b[] 크기의 자료를 b[]의 off 변수 위치부터 저장하며 len만큼 읽는다. 읽은 자료의 바이트 수를 반환.
- void close(): 입력 스트림과 연결된 대상 리소스를 닫는다.

- FileOutputStream: 바이트 단위로 파일에 자료를 쓴다.
- void write(int b): 한 바이트를 출력함.
- void write(byte[] b): b[] 배열에 있는 자료를 출력함.
- void flush(): 출력을 위해 잠시 자료가 머무르는 출력 버퍼를 강제로 비워 자료를 출력.
- void close(): 출력 버퍼가 비워지고 출력 스트림과 연결된 대상 리소스를 닫음.

