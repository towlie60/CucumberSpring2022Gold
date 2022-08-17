###Cucumber

Cucumber is a tool that supports Behavior Driven Development (BDD). It offers a way to write tests that
anybody can understand, regardless of their technical knowledge.

What is the problem with reading tests requiring technical knowledge? 
BA, PO, SCRUM MASTER, Manual QAs - you have to explain them what's your test doing.
When there is a uncertainty about a test failure due to not clear requirements.
You have to explain PO the exact test scenario in a written form. Too much time for explaining. 

Documentation - explain the flow of the work.


##Feature file
is one file that contains tests for one functionality. For every functionality you create
one feature file. 

Every feature file should start with a Feature: keyword.

Feature files are written in Gherkin Language. 

##Scenario
One Scenario is one test. Scenarios - Test Scenario.


##Steps
Given -> should be used for pre requisite(setup) test steps. Past tense should used ex:
Given User JohnDoe is registered.
When -> should be used for action steps of actual functionality of the test. present tense
When User JognDoe with password 123Pass logs in
Then -> should be used for validation(assertion) of the result. use should word. 
Then User JohnDoe should be navigated to homePage.


And ->  when you have multiple pre requisite or action steps. you dont want to have
Given
Given
Given
When
When
When
Then
Then

rather
Given
And
And
When
And
And
Then
And


##Step definitions (Glue Code)
Cucumber masks the technical testing steps with the help of Gherkin Language. in order for us
to map those gherkin steps to a java code Cucumber uses step definitons. 

Step definition is a java glue code which maps to a corresponding feature file step.



###Best Practices (Designing Dynamic Steps)
1. Design step defs in a dynamic way so that the same step can be reused as many times as we need 
for the same kind of actions but the test data should be parameterized. use Strings, doubles, int & chars.

2. If there are pre-condition steps repeating in every scenario within a feature we should use Background.
This will help us avoid repetition. Steps in Background will run before every scenario of the Feature file.

3. If there are multiple test scenarios that are performing the same exact test with different test 
data. Use Scenario Outlines with Example table. Each row in an example table represents one scenario.
This Helps putting 


###Data tables 
There are a lot of functionalities that take a list of objects
as parameters. 

ex: 
Accounting app.
Give report or calculate tax.

//for this functionality to calucate the report we need to
provide List of all invoices. 

report(List<Invoice> invoices)

Data table are row and column table on a feature file scenario
that is passed to a step def:
There are 3 ways of passing data table to step defs

1. Plain cucumber DataTable class(object) which has methods
to convert the data table to list of objects or list of maps

2. Passing the List<Map<String, String>> directly
3. Most popular one is to pass List<Object) directly.

###Difference between DataTable vs Example table.
Example table is dependent on Scenario Outline, so it only can
be used with that pair. 


Each row in example table represent one scenario which means 
all steps in the scenario ouline will be executed same 
amount of times as there are number of rows in the Example table.


DataTable belongs to one step only. 
It is a way of passing list of Objects into the step def. 



###Cucumber Junit(TestNG)
1. Junit in a cucumber framework is used of validations(assertions)
2. Setting up runner classes. - Run multiple test classes. 
Running(Scanning) multiple feature files.


###Before and After annotations A.k.a Before and After Hooks. 
Before hook is a method that is usually used for setting up preconditional test data, enviroment etc. for
all of the tests in the suite. 

###All Cucumber questions
1. Difference between @Before vs Background. ()
   @Before annotation is a global before hook which is/can be applied to all feature files 
   @Before is application specific
   
   Background is specific to only one Feature file.
   Background is feature specific.
   
   If there is a @before and Background -> @before runs first.

2. Tell some disadvantages of your framework, specifically of Cucumber.  
  As you know Cucumber doesn't provide its own runner thus we have to Integrate Junit or TestNG with
  Cucumber. In my most recent project we are using Junit with Cucumber, bc 
  IMO(in my opinion, IMHO(in my humble opinion)) Cucumber provides same 
  features as TestNG, but they are way more flexible. 
  
  So when setting up a Junit Runner and running the smoke or regression suite Junit reports counts 
  number of steps executed as number of tests run. While it should be counting the number of scenarios executed
  .
  So this causes giving a false-positive impression of the amount of tests in our smoke/regression suites. 
  
3. What are Hooks in Cucumber?
Cucumber supports hooks, which are blocks of code that run before or after each scenario.
You can define them anywhere in your project or step definition layers, 
using the methods @Before and @After. Cucumber Hooks allows us to better manage the code workflow
and helps us to reduce the code redundancy. We can say that it is an unseen step,
which allows us to perform our scenarios or tests.

4. 


Running smoke or regression by passing @CucumberOptions vm argument in mvn command line.
1. mvn test -@CucumberOptions="--tags=@smoke" - for smoke
   mvn test -@CucumberOptions="--tags=@regression" - for regression
   
   setup -> since you are using surefire plugin which executes specified tests in the 
   mvn test phase you should only have one TestRunner class.
   

2. Maven profiling.    
   In maven we can have multiple profiles. 
   each maven profile can have different build configurations. 
   //


WFH - Work from Home. I will WFH today. 
OOO - Out of Office. I will be OOO from Feb 23 - 25
AFK - Away from Keyboard. 
PTO - Paid time off. PTO today. 
EOD - End of Day. Please get it done by EOD.
EOM - End of month. End of message. 


