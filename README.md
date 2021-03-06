# Harris Joseph

### Cloud Software Engineer

### Self-Assesed Skills (1-4 scale)
*NOTE 
1 = "I've been paid to write production quality code with it." and 4 = "I could write a Hello World web application if I had a tutorial." 

- Scala: 2.5
- Java: 2
- Python: 1
- Clojure: 4
- Haskell: 4
- Kotlin: 4
- Golang: 4
- Rust: 4
- Groovy: 1
- Node.js: 1
- Ruby: 3
- Angular: 3
- Helm: 2
- Terraform: 3
- MQL (MongoDB Query Language): 3
- SQL: 2

### Honerable Mentions:
- CloudFormation: 1
- Ansible: 1
- Bash: 1
- Powershell: 1.5

## Repo Contents:
*NOTE
All projects except `hex2mime_ez` depend on `sbt`

### Hex2Mime EZ
Easy hex-to-base64 converters for bash and powershell. Docs in project folder.

### HexRad
Simple Scala command line tool for converting hexidecimal representation to base64

#### Usage:
Navigate to the `hexrad` directory.

Bash/MS shell:
```sh
sbt "run 45766964696e74"

>RXZpZGludA==
```
SBT shell:
```sh
run 45766964696e74

>RXZpZGludA==
```

### SpecialMath
Simple Scala replica of [this script](https://github.com/SignalPath/CodeTests/blob/master/specialMath.py).
#### Usage
Navigate to the `specialmath` directory.

Bash/MS shell:
```sh
sbt "run 7"

>79
sbt "run 17"

>10926
# Don't do this in recursive (main) branch 
# unless you have 1000000000000 years to wait
sbt "run 90"

>19740274219868223074
```
SBT shell:
```sh
run 7

>79
run 17

>10926
# Don't do this in recursive (main) branch 
# unless you have 1000000000000 years to wait
run 90

>19740274219868223074
```