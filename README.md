# zero-to-unlimited

## or create a new repository on the command line
echo "# zero-to-unlimited" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/thont110-bkhn/zero-to-unlimited.git
git push -u origin main

## or push an existing repository from the command line
git remote add origin https://github.com/thont110-bkhn/zero-to-unlimited.git
git branch -M main
git push -u origin main

## or import code from another repository
You can initialize this repository with code from a Subversion, Mercurial, or TFS project.

## ví dụ về đoạn code java
```java
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        // no solution, just return null
        return null;
    }
```

## ví dụ về sẽ sơ đồ diagram
```plantuml
@startuml
Alice -> Bob: Authentication Request
Bob --> Alice: Authentication Response

Alice -> Bob: Another authentication Request
Alice <-- Bob: Another authentication Response
@enduml
```
    