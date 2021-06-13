# alishevSpring

in the second commit with name "Inversion of Control" we considered 3 problems
  1.  MusicPlayer сильно зависит от ClassicalMusic. класс MusicPlayer сильео заточен на работу только с ClassicalMusic:
        class MusicPlayer{
          private ClassicalMusic classicalMusic;
          
          public void player(){
              classicalMusic=new ClassicalMusic();  
          }
        } //Сильная зависимость
        
     Решение: использовать интерфейс или абстрактный класс, который бы обощал различные музыкальные жанры.
     
  2. Объекты создаются вручную. Мы хотим вынести эти детали в конфигурационный файл, а не лезть постоянно в код(и перекомпилировать его) для тогоб чтобы поменять объект:
        class MusicPlayer{
          private Music music;
          
          public void player(){
              music=new ClassicalMusic();  
              //or
              music= new RockMusic();
          }
        }
      
      Решение: использовать Spring Framework, который сам создасть необходимые объекты(бины) согласно конфигураионному файлу.
      
   3. MusicPlayer сам создает свои зависимости. это архитектурно неправильно - противоречит принципу IoC.
      
      Решение: Использовать принцип IoC: передача зависимости через конструктор.
