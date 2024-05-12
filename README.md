# Java-DSA
## Patterns

### Hollow Rectangle
```
* * * * * 
*       *
*       *
* * * * *
```
```
 public static void hollow_rectangle(int totalRows, int totalColumns) {
        for (int i = 1; i <= totalRows; i++) {

            for (int j = 1; j <= totalColumns; j++) {

                if (i == 1 || i == totalRows || j == 1 || j == totalColumns) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
```
## Array
**Definition** list of Elemet of the same type placed in a contiguous memory location.

**Operation**

- Create
- Input
- Output
- Update

#### Syntax
```
dataType arrayName[] = new dataType[size];
int makrs[] = new int[50];
int numbers[] = {1,2,3,4};
int moreNumbers[] = {4,5,6};
String fruits[] = {"apple", "mango", "orange"};

```
