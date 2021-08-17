    package homework.task1;

    public class ImplementationOfSuperIntegerList implements SuperIntegerList {
        private int[] mainList = new int[0];
        @Override
        public void add(int number) {
            if (mainList.length > 0){
                int[] temp = new int[mainList.length + 1];
                for(int i = 0; i < mainList.length; i++) {
                    temp[i] = mainList[i];
                }
                temp[mainList.length] = number;
                mainList = temp;
            }
            else {
                mainList = new int[1];
                mainList[0] = number;
            }

        }

        @Override
        public void removeByIndex(int index){
            if (mainList.length == 0) {
                throw new ArrayIndexOutOfBoundsException("Array is empty");
            }
            if (index >= 0 && index < mainList.length){
                int[] temp = new int[mainList.length-1];
                for (int i = 0; i < mainList.length; i++) {
                    if (i < index) {
                        temp[i] = mainList[i];
                    }
                    else {
                        if (i > index) {
                            temp[i - 1] = mainList[i];
                        }
                    }
                }
                mainList = temp;
            }
            else {
                throw new ArrayIndexOutOfBoundsException("Index is incorrect");
            }
        }

        @Override
        public void removeByValue(int value) {
            int count = 0;
            ImplementationOfSuperIntegerList index = new ImplementationOfSuperIntegerList();
            for(int i = 0; i < mainList.length; i++){
                if (mainList[i] == value) {
                        index.add(i);
                        count++;
                    }
                }
            if (count != 0 && index.getLength() != mainList.length)
            {
                int [] temp = new int[mainList.length-count];
                int i = 0;
                int mainListIter = 0;
                int j = 0;
                while (mainListIter < mainList.length && i < temp.length){
                    if (j < index.getLength() && mainListIter == index.get(j)) {
                        mainListIter = index.get(j);
                        j++;
                    }
                    else{
                        temp[i] = mainList[mainListIter];
                        i++;
                    }
                    mainListIter++;

                }
                mainList = temp;
            }
            else {
                if (index.getLength() == mainList.length) {
                mainList = new int[0];
            }
            }
        }

        @Override
        public int get(int index) {
            if (index >= 0 && index < mainList.length) {
                return mainList[index];
            }
            else{
                throw new ArrayIndexOutOfBoundsException("Index is incorrect");
            }
        }

        @Override
        public void printAll() {
            if (mainList.length > 0) {
                for (int i = 0; i < mainList.length; i++)
                    System.out.print(mainList[i] + " ");
            }
            else{
                System.out.println("List is empty");
            }
        }

        public int getLength(){
            if (mainList!=null)
                return mainList.length;
            else
                return 0;

        }
}
