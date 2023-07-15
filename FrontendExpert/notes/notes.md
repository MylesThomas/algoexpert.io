# FrontEndExpert Notes
## Myles Thomas
### 5/25/2023
#### algoexpert.io
---

There are 5 Courses in FrontEndExpert: 
1. HTML Crash Course
1. CSSCrash Course
1. JavaScript Crash Course
1. React Crash Course
1. Web Dev Fundamentals

---
# HTML Crash Course

![alt text for screen readers](./figures/html/intro.png)

---
# Lesson 1: Introduction

HTML
- weird topic
    - people assume you know it even though not classes available with depth
        - there is a lot of complexity that can set you apart 

- although modern frameworks abstract away HTML, these are still HTML!
    - all frameworks must up rendering HTML (it is the building block!)
    - All content on the webpage is HTML
    - Example: JavaScript
        - Using javascript to add functionality - it will help knowing HTML 

    - JavaScript and CSS quesions will be easier if you know HTML

---
# Lesson 2: HTML Basics

## Header:

In order to build a solid foundation, we need to start w/ the basics!

## Key Terms:

### HTML 
HyperText Markup Language
- The primary language of the web
    - contains the content and structure of a webiste

https://developer.mozilla.org/en-US/docs/Web/HTML

### Tag
The primary method of marking up content using HTML
- Tags use the syntax: ```<tagname>content</tagname>```
    - Example:
        - Paragraphs use the 'p' tag:
            - This creates the paragraph "Hello World": 

            - ```<p>Hello World</p>```

- Elements: 
    - Left side tag: Opening tag
        - 
    
    - Right side tag: Closing tag
        - 

    - Everything inside of the tag: Content
        - gets rendered on the page 

- Tags:
    - Some tags don't have any content, known as: 
        - Empty tags
        - Self-closing tags
            - Either use opening tag syntax or ```<tagname/>```

        - Example: 
            - Horizontal rules use the hr tag
                - Create horizontal rule: ```<hr>``` OR ```<hr />```

### Attribute 
Extra information provided to HTML elements, similar to functions parameters.
- Attributes use this syntax: 
    - ```<tagname attribute="value">content</tagname>```
        - The attribute name will always come after the tag name (with a space between them)
        - The quoted value will be separated from the attribute name by an equals sign
            - Example: Input of type "checkbox": ```<input type="checkbox" />```

- A small number of attribues are booleans, rather than strings.
    - Any value for a boolean attribute will be treated as true
        - Examples: all of these would be disabled:
            - ```<input type="checkbox" disabled="disabled" />```
            - ```<input type="checkbox" disabled="true" />```
            - ```<input type="checkbox" disabled />```

---

### < !DOCTYPE html> 

The required first line of every HTML file, for telling the browser what version of HTML to use 
- A doctype of html will use the modern HTML5 standard
    - While a page will usually render properly without a doctype declaration, they should still be included 
        - some older browsers will not render pages following a more modern specification ("quirks" mode)

### < head>
The tag containing metadata about the HTML document
- it is anything that is not displayed on the page/screen
- the ```<head>``` head of the HTML file should be the 1st tag within the ```<html>```  tag

- The < title >  is the only required tag within the ```<head>```
    - This tag gives the page a title, which is used for the name of the tab in most browsers
        - Also gets used for search results in many search engines

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/head      


### ```<body>``` 
The tag containing the content of the webpage 
- The ```<body>```  of the HTML file should be the 2nd tag within the ```<html>```  tag (right below ```<head>``` )
                

## My notes from the video:

HyperText Markup Language
- HyperText: text with hyperlinks 
- Markup Language: annotate text

Example: 
- My Blog Post              (heading)
    - 2 sections:           
        - Day 1             (sub-heading)
            - text          (paragraph)
        - Day 2             (sub-heading)
            - text          (paragraph)

How do we make annotations?
- Tags
    - Example: Hello World
        - ```<p>hello world</p>```
            - ```<p>...</p>``` are known as ankle brackets
            - most tags follow this, besides:
                - empty tags
                    - horizontal
                    - self closing tags
                        - more on these next

Thematic Break/Horizontal Tag/Self closing tag
- ```<hr>```: 
    - annoying because you don't know if a line is ending

- ```<hr/>```: 
    - this is preferred 
        - these are personal preferences 

Attributes
- Functional parameters

- Example: Check box
    - ```<input/ >```: Takes a regular input
    - ```<input type="chechbox"/ >```: Takes an checkbox input

Comments
- Looks similar to tags:
    - Open comment:  ```<!--``` 
    - Close comment: ```-->```

Whitespace
- Doesn't matter/is ignored in HTML
    - it will be collapsed

- Any of the following space characters:
    - spaces
    - tabs
    - new lines

    - Example:
        - These are the same: 
            1. ```<p>This is text</p>```

            2. ...
            ``` html
            <p>
            This
            is
            text
            </p>
            ```


Full HTML File
1. Doctype: ```<!DOCTYPE html>```
- tells the browser we want to use the most modern version of HTML
    - we can ignore this argument usually

1. HTML tag 
- root of the document 

- always contains these 2 tags: 
    1. Head
        - Holds metadata about the webpage (Not seen on the page) 
            - 1 tag required: ```<title>```
                - Used for tab name / search engines / others

    2. Body
        - All elements seen on the page
            - Paragraph: ```<p>Hello World</p>```


---
# Lesson 3: Semantic HTML 

## Header:

If a human were to read your markup code without any accompanying visual representation, would they understand the structure of your page?

## Key Terms:

### Semantic HTML 
HTML that clearly describes the content of the page 
- HTML loses its semantic meaning when tags are misused/overused
    - Examples: ```<div>```, ```<span>```

- Semantic HTML includes the usage of *semantic grouping tags*, which give meaning to different sections of the page 

    - Some commonly used semantic grouping tags/Elements: 

        - ```<article>```: self-contained
            - independently distributable content
                - (could be itself on the internet)

        - ```<section>```: thematic grouping of content
             - not self contained 
                - (could NOT be itself on the internet)

        - ```<header>```: Intro content

        - ```<main>```: Main content
            - Limited to 1 per page

        - ```<nav>```: A section of links
            - Oftentimes: For the primary navigation of the page

        - ```<aside>```: Non-vital content 
            - indirectly related to main content
                - (page would still make sense without this content)

        - ```<footer>```: Footer 
            - oftentimes: contains copyright information


## My notes from video:

Semantic HTML
---
Does your file make sense without seeing the browser?
- Example: when using a screen reader, we can't see it

- need a way to show what content should be grouped with what other content

Back to Blog Post Example: 
- Group 1: Day 1
    - 
- Group 2: Day 2
    - 
- Group 3: Day 1 + Day 2 (Entire blog post)
    - 

Example: AlgoExpert Reviewed
- Picture: 

    ![alt text for screen readers](./figures/html/1.png)

- Semantic Groupings: 

    - Article: 'AlgoExpert Reviewed'

    - Section: 

    - Header: 'AlgoNews'
        - name of website

    - Main: 

    - nav: tech/business/sports
        - These are links right by the header 

    - aside: 'About the author'
        - we can ready the article without this 

    - Footer: copyright
        - 

---
# Lesson 4: Essential HTML Tags

## Header:

These HTML tags are virtually everywhere 
- ubiquitous/on every page


## Key Terms:

## Paragraph tag (```<p>```)

Used for blocks of text
- Can contain other elements that are part of the paragraph
    - Example: Images

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/p


## Heading tags
HTML tags represented by one of the following:
- ```<h1>``` (top level heading)
- ```<h2>``` (secondary heading)
...
- ```<h6>``` (bottom level heading)

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements


## ```<img>```
The image tag
- this is an empty tag
- a real one should always contain these 2 things: 
    - src: the path to the image (can be relative or absolute)
    - alt: Alternative text to be used with screen readers OR anytime the image can't be displayed

    ``` html
    <img src="img/dog.png" alt="dog!!!" />
    ```

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img

## ```<ul>```
Unordered list tag
- used for a list where the order does not matter
    - by default, most browsers will show this as a bulleted list

    - can contain any # of < li> tags, as in this example: 

    ``` html
    <ul>
        <li>AlgoExpert<li>
        <li>SystemsExpert<li>
        <li>MLExpert<li>
        <li>FrontendExpert<li>
    </ul>
    ```

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/ul

## ```<ol>```
Ordered list tag
- used for a list where the order matters
    - by default, most browsers will show this as a numbered list

    - can contain any # of < li> tags, as in this example: 

    ``` html
    <ol>
        <li>Step 1<li>
        <li>Step 2<li>
        <li>Step 3<li>
    </ol>
    ```
https://developer.mozilla.org/en-US/docs/Web/HTML/Element/ol

## ```<li>```
list item tag
- Used for individual elements, in both ordered/unordered lists
- List items can also contain other lists to create nested lists
    - Example: 

    ``` html
    <ol>
        <li>Step1</li>
        <li>
            Step 2:
            <ol>
                <li>Substep 1:</li>
                <li>Substep 2:</li>
            </ol>
        </li>
        <li>Step 3</li>
    </ol>
    ```

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/li

## ```<pre>```
Preformatted text tag
- Preserves whitespace
    - Can be useful for when indentation and newlines need to be preserved

    ``` html
    <pre>
        *
       ***
      *****
     *******
    *********
       | |
    </pre>
    ```

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/pre

## ```<br>```
Line break tag
- used to create a line break in text
- Popular uses: 
    - Introduction of email
    - New lines in a poem

- Warning:
    - Tag should not be used for spacing out elements that we could otherwise do with CSS

    ``` html
    <p>
        Dear User, <br />
        We hope you are enjoying FrontendExpert!
    </p>
    ```

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/br

## ```<hr>```
Horizontal rule tag
- used to create a thematic break between content (drawn as a horizontal line by default)

``` html
<p>Part 1</p>
<hr />
<p>Part 2</p>
```

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/hr

## ```<a>```
Anchor tag
- Used for linking to other pages
- Tag should include an 'href' attribute w/ path to the page being linked (absolute or relative)

``` html
<a href="https://algoexpert.io">AlgoExpert</a>
```

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/a

## ```<em>```
Emphasis tag
- Usually rendered as italics 

``` html
<p>I <em>need</em> to study!</p>
```

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/em

## ```<strong>```
Strong tag
- Usually renders as bold 

``` html
<p><strong>Note: </strong> This is very important!!!!</p>
```

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/strong

## My notes from video:

Essential HTML Tags

Before starting
- Semantic markup is important
    - We want to describe as best as possible
    - We will not look at output in this video!

- Tags provide content structure, not layout/style

Paragraph (```<p>```)

Headings (```<h1>``` ... ```<h6>```)
- Font size does NOT equal heading level
    - Change that later

Images (```<img src=>```)
- src: path
- alt: alternative text 
    - internet is down / screen readers

Lists (```<ol>``` or ```<ul>```)
- ordered: 
    - 1,2,3,4

- unordered:
    - -,-,-,-,

Preformated text ( ```<pre>```)
- preserves whitespace

Line break (```<br />```)
- self closing tag
- not a replacement for CSS
    - has semantic meaning 

Horizontal rule (```<hr />```)
- similar to br tag
- Splitting up different pieces of content
    - Don't think of it as a horizontal line (can use CSS for that )

Anchor Tag (```<a href="..."> content...<a/>```)
- for hyperlinks
    - href: path/url
    - target: if you want to open a new tab/window
        - defaults to opening new tab

Emphasis (```<em>```)
- Not just italics! Use CSS for that

Strong (```<strong>```)
- Same as emphasis, basically
    - remember, don't use unless it shows importance!

---
# Lesson 5: Tables

## Header:

Tables are best used to organize your page layout
- Table layouts are outdated af

## Key Terms:

## ```<table>```
Table HTML tag for representing data with rows/columns
- General rule: anything that could go into a spreadhseet can also make sense in a table

- A variety of tags associated with tables, these are the most common: 

    - ```<tr>```: single row in the table

    - ```<th>```: heading in the table
        - Use with scope attribute (row/col) to choose what the content is a heading for 

    - ```<td>```: a single piece of data in the table
        - a cell

    - ```<thead>```: a grouping tag for the heading of a table
        - usually containing 1 single < tr> with column headings

    - ```<tbody>```: a grouping tag for the body of the table
        - used for containing the primary rows of data 

    - ```<tfoot>```: a grouping tag for the footer of the table 

    - ```<caption>```: caption/title for the table

    
https://developer.mozilla.org/en-US/docs/Web/HTML/Element/table

## My notes from video:

Tables
- tabular data with rows/column
    - if it belongs in a spreadsheet

Note: CSS w/ HTML tags makes more sense, sometimes

Note: A lot of this table stuff is dumb, JavaScript will do the job WAY better

Here is our code example, commented out: 

This can also be found here: 
/FrontendExpert/5 - Tables/tables.html


---
# Lesson 6: Forms

## Header:

Many joke that frontend developers spend their time editing buttons on forms
- Let's find out how to do it, just in case

## Key Terms:

## ```<form>``` 
HTML tag for a section of interactive inputs
- used for submitting information to the server
- forms usually contain the following:
    - a variety of label-input 
    - submit button

- Example: 
    ``` html
    <form>
        <label for="username">Username:</label>
        <input for="text" id="username" />

        <label for="password">Password:</label>
        <input for="password" id="password" />

        <button>Submit</button>
    </form>
    ```
https://developer.mozilla.org/en-US/docs/Web/HTML/Element/form

## My notes from video:

HTML Forms
- will re-visit with JavaScript course to save data in a server/database
- start taking inputs from user

Logic
- label: title for text box
    - for: which id input it is for 

- input: where the user writes into text box
    - id: lets labels find it 
    - name: what the server knows it as
    - type: text/password/etc.
    - placeholder: grey letters
        - for text

Form validation:
- What if we want passwords to meet a threshold of length? 
    - input minlength="6"
- What if we want to require a box to be filled?
    - input required


Other types of data: 

Date
- pick a date 

Checkbox
- binary check or no

Radio
- have multiple buttons 
    - looks ugly, but CSS can get them on 1 line!

Look at the examle here:
/FrontendExpert/6 - Forms/forms.html

---
# Lesson 7: Document Object Model 

## Header:

Document Object Model
- Time to learn about this because apparently everybody has heard about it, except for me!

## Key Terms:

## Document Object Model
The programming interface for interacting with an HTML document (represented as a tree data structure)
- Each HTML element is a node in the DOM tree
    - Nested content represents children in the tree

## My notes from video:

DOM

What actually happens to our HTML? 
1. Browser recieves our HTML as a text file
- 

2. Browser turns text file into DOM (Document Object Model) tree
- 

3. Browser turns DOM tree and generates UI (user interface)


Purpose of DOM:
- Keeps track of what is on the page

- Provides an API
    - Can interact with the API via JavaScript 

- Tree Structure
    - Elements and text are stored as nodes \
        - Rare node: comets

Example: Document Object Model
![alt text for screen readers](./figures/html/2.png)

Example can be found here: 
/FrontendExpert/7 - Forms/forms.html


---
# Lesson 8: Acessibility

## Header:

Accessible web development leads to a better user experience for all.
- Also, a more inclusive internet 

Let's look at the following: 
- some best practices to follow
- markup elements to include when designing (with accessibility in mind)

## Key Terms:

## Accessibility
Building applications usable by as many people as possible!
- Oftentimes: Utilizing semantic HTML 
    - Ensuring the application works with various assistive technologies


## Accessibility Tree
A tree representation of the page, focusing on information specific to accessibility
- Each node in this tree contains information such as the following:
    - role
    - state
    - name
    - description

- Accessibility tree is created from the DOM tree
    - Keeps in sync with it 
    - Assistive technoligies (ie. screen readers) interact with the accessisibility tree instead of directly with the DOM

https://developer.mozilla.org/en-US/docs/Glossary/Accessibility_tree

## WAI-ARIA (Web Accessibility Initiative - Accessible Rich Internet Applications)
Specification for accessible HTML created by the World Wide Web (W3C)
- Oftentimes, referred to as just ARIA

- Contains a set of HTML attributes that can be added to provide extra information to the accessibility tree.

- ARIA attributes are grouped into 3 major categories: 

    1. Roles: What the element is doing
    - used to define the purpose of the element

    - Subgroups: 

        - Landmark: Major content areas
            - "Navigational landmarks"

        - Structure: Document structure info

        - Widget: Interactive elements

        - Window: Sub-windows in the browswer

        - Live Region: Regions with dynamically changing content  

    2. Properties: Extra meaning and characteristics of the element
    - example: labels

    3. States: Current state of the element
    - example: if it is disabled

https://developer.mozilla.org/en-US/docs/Learn/Accessibility/WAI-ARIA_basics


## My notes from video:

Accessibility - Building Websites for Everyone
- We want people of all ability to use our websites
    - Some use the following: 
        - keyboard
        - assisting technologies (screen reader)

Accessibility tree
- Similar to the DOM tree
    - Has info for accessibility 

    - ![alt text for screen readers](./figures/html/3.png)

- Nodes have: 
    - name
    - description
    - role
    - state

Writing Accessible HTML
1. Use descriptive content, labels, and alt attributes

2. Use semantic elements
- Accessibility tree automatically gets filled in 

3. Test keyboard controls 
- Ensure you can navigate to all parts of websites with keywords 
    - properly interact with inputs


WAI-ARIA (Web Accessibility Initiate)
- Proivdes moves attributes to use in HTML (to fill out the accessibility tree)
    - Roles: what an element does
    - Properties: extra meaning ie. labels
    - States: current state ie. disabled

Landmark Roles
- Major content areas
    - First thing user navigates to when using technologies
    - Examples: 
        - Banner
        - Main
        - Navigation

        ``` html
        <div role="banner">
            <hi>My Accessible Webpage</hi>
        </div>
        ```

Structured Roles
- Document structural information 
    - a little bit less important 
    - Examples: 
        - Tooltip
        - List
        - Table

        ``` html
        <section role="list">
            <div role="listitem">First item</div>
            <div role="listitem">Second item</div>
            <div role="listitem">Third item</div>
        </section>
        ```

Widget
- Identify interactive elements
    - Some of these align with elements we already have, but some widget roles exist and good to use 
- Examples: 
    - Tab
    - Searchbox
    - Button

    ``` html
    <div role="button">
        Click on me!!!
    </div>
    ```

Window Roles
- Sub windows in the browser
    - Remove some content from the rest of the page
    - Usually in a module, such as: 
        - Dialog (separate content)
        - Alert dialog (separate content w/ high importance)

        ``` html
        <div role="dialog" aria-labelledby="title">
            <h2 id="title">Successfully saved changes!</h2>
            <button>Dismiss</button>
        </div>
        ```

Live Region Roles
- Dynamically changes content
    - Will be checked on periodically to notify user of changes
        - Timing on checks depends on content type, such as: 
            - timer
            - log
            - alert

            ``` html
            <ol role="log">
                <li>Chat message 1</li>
                <li>Chat message 2</li>
                <li>Chat message 3</li>
            </ol>
            ```

Aria Live
- Dynamic changing content and importance
    - Tells how often we need to change it
    - Examples: 
        - Off: Don't announce changes
        - Polite: Announce changes when idle
        - Assertive: Announce changes as soon as possible
            - very important alert messages

        ``` html
        <div aria-live="polite">
            My content is about to change!
        </div>
        ```

Aria Properties
- Used to improve accessibility of website

- Examples: 

    - Aria-label: Label not visible on UI
        - part of markup tree/accessibility tree
            - nice for something that is easy to see but won't be visible on markup tree

    - Aria-labelledby: Another element as a label, passed by ID
        - Using another element as the entire label
            - Similar to "for" attribute

    - Aria-description: More detail than labels
        - Longer and more detailed 

    - Aria-describedby: Another element as a description, passed by ID
        - Works just like labelledby

    ``` html
    <div role="dialog" aria-labelledby="title">
        <h2 id="title">Successfully saved changes</h2>
        <button>Dismiss</button>
    </div>
    ```

Aria States
- Provide stateful information
    - Usually used for inputs 

- Examples: 

    - aria-checked: checkbox state 

    - aria-disabled: element is disabled 
    
    - aria-expanded: expanded or collapsed
    
    - aria-hidden: not visible on page
    
    - aria-pressed: toggle is currently on/pressed
    
    - aria-selected: element is currently selected
    
    - much more!
        - pretty much anything you could think of that you'd need to tell the user

    ``` html
    <div roles="checkbox" aria-checked="true">
        I am checked rn!
    </div>
    ```
    
Other concerns
- Browser compatibility
    - Some people use old browsers, we need to account for them
        - some cutting edge features won't be supported

- CSS Accessibility
    - Use the following in good practice: 

        - Contrast (colors make elements stand out different)
        - Legible font
        - Mobile support (4k monitor vs. phone)
        - etc.

- Internationalization (il8n)
    - language support
    - Test with different "styles" of languages
        - We want support for different regions
        - Some text goes vertically vs. horizontally

Code Example:
Can be found here:
[Another_on_this_local_device] (C:/Users/Myles/OneDrive/Documents/algoexpert.io/FrontendExpert/html_crash_course/8 - Accessibility/accessibility.html)

Takeaways
- 

---
# Lesson 9: Meta Tags

## Header:

Metadata is special information about your webpage
- can be used by search engines and web browsers to do cool stuff
    - where do you define this data?

## Key Terms:

## ```<meta>```
HTML tag for providing extra metadata about a webpage
- Most meta tags will use 'name' and 'content' pair for the type of metadata and its value 

- Common metadata tags: 

    ``` html
    <!-- Sets the character encoding to utf-8 -->
    <meta charset="utf-8" />

    <!-- Allows for custom responsive CSS, rather than the default scaling behavior or small devices -->
    <meta name="viewport" content="width=device-width, initial-scale=1" />

    <!-- Sets the page author to utf-8 -->
    <meta name="author" content="Myles Thomas" />

    <!-- Sets the page description to utf-8 -->
    <meta name="description" content="Ace the frontend interviews!" />
    ```

## Favicon
"Favorite icon"
- the icon for a web page
    - browswers usually show these in a variety of places, such as: 
        - next to the tab name

    - favicons are created using the < link> tag:

        ``` html
        <link rel="icon" href"favicon.png" />
        ``` 

## ```<base>```
Tag for setting the document base URL 
- Used for all relative links on the page

    - Example: 

    ``` html
    <!-- This line goes in the <head> -->
    <base href="https://algoexpert.io">

    <!-- This would go to https://algoexpert.io/frontend -->
    <a href="/frontend">FrontendExpert</a>
    ```

https://developer.mozilla.org/en-US/docs/Web/HTML/Element/base

## My notes from video:

Meta Tags 

HTML head tag
- used for information that is not on the page

- 1 required: title
    - name of tab in browswer
    - browswer history
    - accessiblity


# HTML Crash Course

![alt text for screen readers](./figures/css/intro.png)

---
# Lesson 1: Introduction

Intro

CSS

- Primary way to add color/styling

- Can change colors/animations

- Syntax is Very simple
    - Can be complex ie. stacking on 3D/Z axis

- Frustration 

    - Hard to debug

    - Lack of understanding of core concepts

Core concepts:

- Box model

- Stacking elements

Deep dives

- Fundamental for interviews

    - Don't want to get stuck centering a page lol

- Fundamental for being a good frontend engineer

    - Must know feasability of design

- Quiz type

    - Fundamentals

- Best practices must be practiced

- Maximize productivity 



# Lesson 2: CSS Basics

Your journey to CSS mastery begins with the basics

# Key Terms

## CSS (Cascading Style Sheets)

Primary styling guide of the web

- Language is used to describe the style/layout of HTML documents

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS



## Cascading

The order that stylesheets are used

- Can be grouped into 3 main categories:
    
    - User Agent Stylesheets: Contain browser defaults for styles 
        - these get lowest level of precedence

    - User stylesheets: Contain user preferences saved in the browser
        - Overrides user agent stylesheets

    - Author Stylesheets: Contain the CSS code we write
        - Get highest level of precedence
            - Assuming 'limportant' has not been used

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/Cascade



## Declaration

A CSS property-value pair in the form property: value

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/Syntax#css_declarations



## Declaration Block

A group of declarations surrounded by {}

Example: 

``` css
{
    color: blue;
    margin: 10px;
}
```

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/Syntax#css_declaration_blocks



## Ruleset

A selector, followed by a declaration block for styling elements matching the selector with the declarations in the declaration block.

Rulesets follow this syntax: 

``` css
selector {
    property: value;
    property: value;
}
```

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/Syntax#css_rulesets

## ```<link>```

A self-closing HTML tag for linking external resources, usually CSS stylesheets

- When linking a stylesheet, ```<link>``` takes 2 attributes: 

1. rel: the relationship to the other document
- this should be 'stylesheet'

2. href: the path to the linked file
- relative or absolute

Learn more: https://developer.mozilla.org/en-US/docs/Web/HTML/Element/link


# Notes from the video

Cascading Style Sheets

2 purposes: 

1. Style our website
- Fonts, colors

2. Describe the layout
- Size/position of elements

3 Main types of style sheets: 

1. User-agent stylesheets

2. User stylesheets

3. Author stylesheets
- highest level of preference 


Declarations
- individual rules
    - exampmle: 
    ``` css
    property: value;
    color: red;
    ```

Ruleset
- Has 2 primary components: 
    1. selector: which elements are effected
    2. declaration block: collections of declarations

``` css
hi, p {
    color: blue;
    margin: 10px; 
}
```
- selector: h1, p (header1, paragraph)
- declaration block: color and margin declartions 

Comments
- easy, and can be multiple lines: 

``` css
/* This is how to make a comment
a
a
a
a
*/ and now this would be an error
```


Linking CSS back to HTML
- goes in the head so it doesn't go in the page
- 2 attributes: 
    - rel: says what the relationship is to the HTML
    - href: path
        - usually is styles.css

``` css
<link rel="stylesheet" href="name-of-file.css" />
```

That's really it for CSS basics!

Here is an example: 

1. Create directory '2 - Basics':
- npm init -y
- npm install http-server -g

2. Put code into 'basics.html' and 'styles.css':

3. Start server:
- http-server

4. Optional: Make changes and have them reflect on the screen: 
- Ctrl-F5

Code examples to learn from:

``` html
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>CSS Basics</title>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <h1>Hello World from H1!</h1>
        <p>I am a paragraph...</p>
    </body>
</html>
```

``` css
h1 {
    text-align: center;
    color: brown;
    font-weight: normal;
    text-decoration: underline;
}

p {
    background-color: rebeccapurple;
    color: white;
    text-align: right;
    min-height: 100px; /* min-height is better than height because large default font would be trapped in */
    font: 1.25rem; /* rem:  root em, font size relative to the size of the root element (HTML tag's) */
    width: 30%; /* width: 30% of page */
}
```


# Lesson 3: Selectors

CSS offers a selection of selectors for you to select from

# Key Term

## Selector

A pattern used at the beginning of a ruleset for choosing which elements will be affected by the declarations.

Variety of selector types: 
- Type selector: Selects all of the elements of a specific HTML tag
    - Example: h1 would select all ```<h1>``` elements

- Class selector: Selects all elements with a specific HTML class attribute
    - Class selectors are prefixed with ```.```
    - For example: ```.foo```
        - that would select all HTML elements with the ```attribute class="foo"```

- ID Selector: Selects an element with a specific HTML ID attribute
    - ID selectors are prefixed with a ```#```
    - Example: ```#bar```
        - that would select the HTML element with the ```attribute id="bar"```

- Attribute Selector: Selects all elements with a specific HTML attribute set to a specific value 
- These are surrounded by ```[]``` and use ```=``` as a delimiter between the attribute name/value
- Example: ```[type="submit"]``` would select all elements with a type attribute set to "submit"

- Excluding the value will select all elements with the attribute set to any value 
- Example: ```[type]``` would select all elements with the type attribute set, regardless of value. 

- Attribute selectors can also use special syntax for basic pattern matching within the value.
    - There are a variety of options here, but these are some of the more common ones: 

        - ```[href*="algoexpert.io"]```: this would select all elements with an href attribute with the text "algoexpert.io" at any location

        - ```[href$="algoexpert.io"]```: this would select all elements with an href attribute at the end

        - ```[href^="algoexpert.io"]```: this would select all elements with an href attribute at the beginning

- Combinator: Combines multiple selectors to select elements based on their location in the DOM

- A few types of combanitors: 

    - Descendant combinator: Represented by a space (``` ```)
        - format: ```selector1 selector2```
    - Selects all elements that match ```selector2``` and are a descendant of an element matching ```selector1```.
        - A descendant does not need to be a direct child 
        - Example: Think of a folder with 3 sub-directories, it would match 

    - Child combinator: Represented by ```>```
        - format: ```selector1 > selector2```
    - Selects all elements that match ```selector2``` and are a sibling of an element matching ```selector1```.
        - The element matching  ```selector2``` must come after the element matching ```selector1```

    - Sibling combinator: Represented by ```~```
        - format: ```selector1 ~ selector2```
    - Selects all elements that match ```selector2``` and are a sibling of an element matching ```selector1```
        - The element matching ```selector2``` must come after the element matching ```selector1```

    - Adjacent sibling combinator: Represented by ```+```
        - format: ```selector1 + selector2```
    - Selects all elements that match ```selector2``` and have an element matching ```selector1``` directly before them in the DOM 

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors


# Notes from the video: 

CSS Selectors
- being more specific with the elements that we select

Start by making this super basic example before adding to styles.css: 

![Alt text](figures/2.png)

Note: run.sh to setup directory, manually call http-server


``` css
/* This would grab everything with class="red"*/
.red {
    color: white;
}

/* This would grab everything, period*/
* {
    color: red;
}

/*This would grab everything with id="red" */
#red {
    color: black;
}

/*This would grab everything with type 'a' AND href=='https://algoexpert.io' */
a[href="https://algoexpert.io"] {
    color: green;
}

/*This would grab everything with type 'a' AND href STARTS WITH'https://algoexpert.io' */
a[href^="https://algoexpert.io"] {
    color: green;
}

/*Combinator Selectors*/

/*Look for paragraphs, anywhere inside of footer*/
footer p {
    color: pink;
}

/*Child selector: Look for paragraphs, directly inside of footer
Div paragraph is inside of div AND inside of footer, so it stays black*/
footer > p {
    color: pink;
}

/*Sibling Selectors*/
/*Shares same parents ie. right next to each other*/

/*Get any paragraph that is a sibling of h2*/
h2 ~ p {
    color: aqua;
}

/*Get any anchor tag that is adjacent to h2*/
/*Systems expert top line is adjacent, the others are not!*/
h2 + a {
    color: brown;
}
```

# Lesson 4: Pseudo Classes And Elements

# Key Terms

## Pseudo Class
An addition to a CSS Selector for selecting based on the current state of the element

- Start with ```:```
- example: ```button:hover``` would select buttons currently hovered over

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/Pseudo-classes

## Pseudo Element
An addition to a CSS selector for selecting a specific portion of the element 
- Starts with ```::```
- example: ```p::first-letter``` would select the first letter of paragraphs

- ```::before``` and ```::after``` are special pseudo elements that insert child before or after the content of the element, allowing for styling before/after the comment
    - Oftentimes, used with the CSS ```content``` property (not always)

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/Pseudo-elements

# Notes from the video: 

Pseudo Classes and Elements
- for selecting based on current state in the doc 
    - Example: Just elements that are currently disabled
    - Example: First letter/first line 

``` css
/*Pseudo Classes
------------------------------------*/

/*Links that are un-visited*/
a:link {
    color: red
}

/*When we come back it is purple, 
hence the links that are un-visited part...
- Now we are taking the 1 <a> that's visited and making it green */
a:visited {
    color: green;
}

/*Style based on current state 
ie. "what they are currently doing"*/
input:focus {
    outline: 10px solid blue; /*When I click box, it gets huge and blue*/
}

/*Select invalid inputs
Output must be 6+ or it will be red once you click out*/
input:invalid:not(:focus) {
    outline: 15px solid red;
} /*When you start typing, both this and the big blue are true!
CSS will default to this since it is lower in the .css file
Add :not(:focus) so fix this, so it waits for you to stop typing!
ie. 
Blue: Hello World
Red: Hello*/

/*Select elements based on location in the DOM
This takes the 1st paragraph in a set of direct sibling 'Go to' */
p:first-of-type {
    color: orange;
    font-size: 32px; /*16x is default*/
}

p:last-of-type {
    color: purple;
    font-size: 8px;
}

/*Selects odd/even/(2n-1 is odd)*/
p:nth-of-type(2n-1) {
    color: pink;
}

/*look at every element ie. div: whos your first child */
p:first-child {
    color: greenyellow;
    font-size: 24px;
}


/*Pseudo Elements
------------------------------------*/

/*first letter (of all <p>)*/
p::first-letter {
    font-size: 2em; /*2x size of current font*/
}

/*before and after are self explanatory*/
p::before {
    content: ">";
}
p::after {
    content: "!"; /*make sure HTML is on same line to avoid whitespace*/
}
```


# Lesson 5: Selector Specificity

Humans often resort to violence as a means of conflict

CSS takes a math approach to settling disputes

# Key Term

## Specificity 
The algorithm used by the browser to determine which CSS declarations to use when an element is selected by 2 rulesets with the same property 
- Roughly calculated by counting the number of each selector type involved in a selector and multiplying by a weight
- These weights are as follows: 

    - Inline styles: 1000
        - Not recommended: This is writing CSS in your HTML file (Trump card)

    - IDs: 100

    - Classes: 10

    - Pseudo-Classes: 10

    - Attributes: 10

    - Elements: 1

    - Pseudo-Elements: 1

    
Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/Specificity


# Notes from the video: 

Selector Specifity
- Conflicting rulesets

Specific selectors win!
- The most "specific" selector gets used
    - Default: Last rule in the stylesheet (if they tie)

Example: 

``` css
a[href="https://algoexpert.io"] {
    color: green;
}

section.links a {
    color: red;
}
```

Scores: 

1. 11
- a: 1 (element)
- href: 10 (attribute)

2. 12 - winner
- section: 1 (element)
- link: 10 (attribute)
- a: 1 (element)

Override: ```!important```
- "This is so important, use it regardless"
    - avoid using this, it ruins the cascading nature of CSS

    - When it can be useful: Using a library




# Lesson 6: CSS Units

Most units are useless, but time to learn

# Key Terms

## Absolute Unit
A unit whose value is not dependent on something else
- its size will be constant regardless of context 
    - example: ```px```

## Relative Unit
A unit whos value is dependent on something else
- Most frequently used relative units: 
    - ```em```: Relative to the font size (parent font size)
        - Example: Font size is ```14px```, with ```1.5em``` you'd get 21px

    - ```rem```: Relative to the root element's font size
        - This is usually ```16px``` (unless overridden by user's stylesheet)
        - Author stylesheets can change this by setting a font size on the html selector OR the ```:root``` pseudo class
        - example: by default, ```1.5rem``` will be ```24px```

    - ```%```: A percentage 
        - Usually of the parents value for the same property
            - Example: width of ```50%``` would be half the size of parent's width

    - ```vw```: A percentage of the width of the viewport
        - Example:  ```50vw``` would be half width of viewport

    - ```vh```: A percentage of the height of the viewport
        - Example:  ```50vh``` would be half height of viewport

    - ```ch```: The number of characters on a line
        - Based on the size of the "0" character in the element's font 
            - Can be useful to prevent paragraphs from spanning more than -70 characters in width (it can be hard to read)

# Notes from the video: 

How To Choose Units

Lengths: 
- most basic: px (absolute)
    - inches/cm don't get used much 

- common: em/rem

- relative to viewport: vm/vh

- width based on characters: ch

- percentage: %

How to choose units? 
- be consistent with code of existing project

Width/Height
- %: relative to parent
- vw/vh: relative to viewport
- ch: for paragraph widths
- rem: close to absolute value 
    - last resort: px

Margin/Padding
- rem: for closer to absolute values
- em: to scale with font size
- px: for small values (last resort)

Borders/Shadows
- px: small values 
    - we often don't want to actually scale these
- rem/em
    - note: scaling doesn't always look great 

Font Size
- rem: best
- em: confusing with large projects due to large chain of parents
- last resort: px
    - will prevent user preferences

Colors
- keywords: red/blue
    - avoid super common colors for full projects because they are generic and stand out 

- Hex RGB: #4B7DAF (red, green, blue)
    - most common

- RGB: rgb(75, 125, 175)
    - RGBA: rgba(75, 125, 175, .5)
        - note: 'a' is for alpha value at end (transparency)

- HSL: hsl(210, 40%, 49%)
    - HSLA: hsla(210, 40%, 49%, .5) 
        - note: 'a' is for alpha value at end (transparency)

Quick Demo: 
/6 - CSS Units

``` css
/*new stuff*/
html {
    font-size: 24px; /*makes all html scale up from 16 to 24*/
}

/*Fix the paragraph that is super long (bad user experience)*/
p {
    width: 60ch; /*60 character/line regardless of window size (using 50% is a bad idea)*/
}

/*for the id="parent"*/
#parent {
    font-size: 1.5em;
    width: 60%;
    border: 2px solid black;
}

/*old stuff*/

/*for the id="red"*/
#red {
    font-size: 1em;
    width: 50%;
    background-color: red;
}
/*for the id="blue"*/
#blue {
    font-size: 1rem;
    width: 50vw; 
    background-color: rgba(75, 125, 175, 0.3); /*hard to read: #4b7daf*/
} /*a: alpha value for shade/transparency*/

/*for the id="green"*/
#green {
    font-size: 16px; /*doesn't scale with html, which is bad*/
    width: 10rem;
    background-color: green;
}
/*for anything inside of div*/
div {
    margin: 10px;
    color: white;
}
```

# Lesson 7: Block vs. Inline
block
block
inline inline inline

# Key Terms: 

## Block Element 
An element with its ```display``` property set to ```block```. These have a few key properties: 
- they start on new lines 
- by default they span the entire width of their parent 

Learn more: https://developer.mozilla.org/en-US/docs/Glossary/Block-level_content

## Inline Element 
An element with its ```display``` property set to ```inline```. These have a few key properties:

- they start immediately after the content behind them (without a new line)
- they span the width of their content 
- ```width``` and ```height``` properties with no effect on them

Learn more: https://developer.mozilla.org/en-US/docs/Glossary/Inline-level_content

## Inline-Block Element
An element with its ```display``` property set to ```inline-block```. These have a few key properties:
- they start immediately after the content before them (without a new line)
- they span the width of their content
    - by default, but this can be changed


# Notes from the video: 

Code examples: 

``` css
/*Border is currently taking up the entire width of the body
- its defaults to block level element
    - defaults to entire width of parent
    - starts on new line

p is the parent of em, so if we change p's width, em will change too */

p {
    display: inline-block; /*middle ground: */
    width: 30vw;
    border: 2px solid black;
}

em {
    /*width: 100vw;
    height: 100vh;*/ /*these do nothing at first: inline elements look at width of content */

    border: 2px solid blue;

    /*display: block; this makes the height/width turn on*/
    /*margin: 10px; splits them up a bit */ 
}


```

# Lesson 8: Box Model

Think outside/inside the box!

# Key Terms: 

## Box Model
A box surrounding all elements on the document used for layout 
- Consists of the following:
    - content
    - padding
    - border
    - margin

Learn more: https://developer.mozilla.org/en-US/docs/Learn/CSS/Building_blocks/The_box_model

## ```padding```
A property used to create extra space within an element, between the ```content``` and ```border```
- the ```padding``` CSS property is shorthand for ```padding-top```, ```padding-right```, ```padding-bottom```, and ```padding-left``` (in that order)

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/padding

## ```border```
A property used to create a border around the content and padding of an element
- The ```border``` CSS property is shorthand for ```border-color```, ```border-style```, and ```border-width```, which it takes as space separated values (in any order)
- Example: ```border: 1px solid black```: this would create 1 pixel w/ solid black border

- A ```border-radius``` can also be used to create rounded corners on an element, regardless if it has a border
    - This defines the radius of the corners, and a value of ```50%``` is often used on square elements to create a circle!

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/border

## ```margin```
A property used to create extra space around an element. 
- The ```margin``` CSS property is shorthand for ```margin-top```, ```margin-right```, ```margin-bottom``` and ```margin-left``` (in that order) 

- A value of `auto` can also be used to allow the browser to choose margins
    - this will usually center block elements horizontally

Adjacent Horizontal vs. Adjacent Vertical:
-  horizontal margins: will be added together to determine the space between elements
- Vertical margins: will be collapsed usually (only the larger margin value will be used)

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/margin

# Notes from the video: 

Box Model
- how element show up on the page 
- using the following: 
    - margin
    - border
    - padding
    - content of those elements

Initial state: 

``` html
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Box Model</title>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <p>I'm a paragraph!</p>
        <p>I'm <em>another</em> paragraph!</p>
    </body>
</html>
```

``` css
p {
    margin: 24px;
    padding: 10px;
    border: 2px solid black;
    background-color: lightblue;
}
```

![alt text for screen readers](./figures/css/3.png)

How to get to this screen^:
Chrome > Right click on page > 'Inspect'
- Reference: https://www.google.com/search?q=view+chrome+elements+styles&oq=view+chrome+elements+styles+&aqs=chrome..69i57j33i160l5j33i22i29i30l2.3456j0j7&sourceid=chrome&ie=UTF-8

Order: 
1. Content: in the middle
1. Padding: between content and the border
1. Border: 2px solid black
1. Margin: space that element says "this is minimum space between me and other elements
- minimum: the margins don't add together
    - 2 elements with 24px don't add to 48, they stay at 24
        - "Collapsing margins"
            - vertical: use the bigger margin value  
            - horizontal: add the values up 

What happens when he disables 'margin' in styles.css:
- The margin defaults back to 1em, which is what the user agent stylesheet says
    - this is the default if styles.css doesn't say otherwise


Examples:

``` css
p {
    /*Pushes the element below the 1st paragraph down */
    margin-bottom: 48px;
}
```

``` css
p {
    /*These are the same exact 2 things: */
    margin-top: 48px;
    margin-right: 24px;
    margin-bottom: 0;
    margin-left: 10px;

    margin: 48px 24px 0 10px; /*Top/right/bottom/left (clockwise) */
}
```

Margin-auto: allows the browser to make a decision
- most of the time, this defaults to 0
    - the paragraphs are nearly touching each other
    - 

``` css
/*centered*/
p {
    margin: auto;
    width: 30%
}

/* NOT centered*/
p {
    width: 30%
}

/*Common way to get a simple layout: */
p {
    margin: 24px auto;
    width: 30%
}
```

One more trick with margin: Negative margin values!

``` css
p {
    margin-left: -10px;
}
```

What negative margin values do here: 
- shifts the elements 10 pixels to the left
    - it pulls it closer
        - avoid using: can create weird effects
        

Going into the element of the word "another" that was emphasized:

``` html
<p>I'm <em>another</em> paragraph!</p>
```

``` css
element.style {
    margin: 24px;
}

em {
    font-style: italic;
}
```

See the following state:
- horizontal margin: working
- vertical margin: none

![hey there](./figures/css/4.png)

Why?

Vertical Margins have no impact on inline elements!
- this is true for padding as well


Padding

``` css
p {
    padding: 10px;
}
```

- Very similar to margin
    - Works the same way ie. has 4 values top/right/bottom/left

    - Not everything works the exact same!

        - Padding cannot do the following: 
            - Take negative values

- Difference between padding and margin:
    - 
    - "space goes inside of the border, rather than outside of the border"

- Purpose:
    - YES: Push the border closer to/farther away from the content
    - NO: Push the element away from other elements



Borders

``` css
p {
    border: 2px solid black; /*standard border all 4 sides*/
}
```

``` css
p {
    border-top: 2px solid red;
    border-bottom: 2px solid black;
    border-radius: 10px; /*adds curvature instead of sharp corners: 50% means circular shape*/
}
```


Box Model Ending Notes/Overview:
- Very powerful way to lay out our elements

![alt text for screen readers](./figures/css/5.png)

Elements of the box model:
1. Content
- The middle/actual content of our element

1. Padding
- Outside of content
- Space between the element and the border
    - Background colors WILL affect this (it affects anything inside of the border)

1. Border
- Edges of the element

1. Margin
- Space between 2 different elements
- Remember: 
    - Vertical: collapsed
    - Horizontal: add the values together



# Lesson 9: Box Sizing

*insert joke about countries/CSS both having to share border conflicts*

# Key Terms

## ```box-sizing```
A CSS property for specifying how width and height should be calculated for the selected element

- Default value: ```content-box```
    - Sets the width and height to only control the size of the content 

    - However: a value of ```border-box``` would include the size of the padding and border as well

    - Examples: 

        - An element has the following givens: 

        ``` css
        e {
            width: 100px;
            padding: 12px;
            border: 24px;
        }
        ```

        - Example 1: content-box (Default value) 
            ``` css
            box-sizing: content-box;
            ```
            - Adding this would take up a total of 172px of width
                - this includes the padding and border 2x to account for the left/right sides
                    - 100 + (2 * 12) + (2 * 24) = 172

        - Example 2: border-box 
            ``` css
            box-sizing: border-box;
            ```
            - Only 100px of width

        
Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/box-sizing

# Notes from the video:

Example Output: 

![6](./figures/css/6.png)

CSS Code: 

``` css
#container {
    width: 300px;
    background-color: lightblue;
}

#child {
    width: 100%;
    border: 10px solid black;
    padding: 12px;
    background-color: orange;
}
```

What is happening: 
- "Child" is overflowing because it is not accounted for in the width

- Remedy:

    - Box sizing property!

        - This makes width 100% contain the padding/border

            - 100% for width: width of 300px - padding - border

        ``` css
        * {
            box-sizing: border-box;
        }
        ```

        - ![7](./figures/css/7.png)


Ending Note: If you are joining an existing project, check to see if they use border-box or content-box!



# Lesson 10: Position

Commonly known as one of the following:
- "why doesn't this work" 
- "I hate CSS"
- "I need a drink"

# Key Term

## ```position```
A CSS property for setting how the browser should position an element in the document

- Default value: `static`

- Can take a variety of values: 

    - `static`: The element follows the flow of the document  

    - `fixed`: The element is positioned relative to the viewport and is removed from the normal flow of the document
        - `top`, `right`, `bottom`, `left`, properties can be used to move the element

    - `relative`: The element is positioned in the same place as it would be with `static`
        - Can use these to reposition it: `top`, `right`, `bottom`, `left`

    - `sticky`: The element will act similar to a `relative` positioned element, but once it scrolls off screen it will stay fixed to the screen
        - Essentially acting as `position: fixed`
        - This is particularly useful for menu bars (think how the menu bar should 'stick' to the top of the screen, no matter where the user scrolls)

    - `absolute`: By default, the element acts the same as `fixed`, except the element will be positioned relative to the document (instead of the viewport)

        - What this means: 

            - as the page is scrolled, it will move with the page (rather than staying at the same viewport location)

            - however, if any *ancestor* has a position value other than `static`, then it will be positioned relative to that nearest positioned ancestor

                - ancestor: "An element that contains (at any level) other elements is an ancestor of the elements that it contains."

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/position

# Notes from the video: 


CSS Positioning

Example Output: 

![8](./figures/css/8.png)

CSS Code: 

``` css
p {
    font-size: 1.75rem;
    margin: 1.5rem;
    padding: 1rem;
    border: 2px solid black;
}

body > p {
    background-color: lightblue;
}

#box {
    width: 15rem;
    height: 10rem;
    border: 2px solid black;
    background-color: lightgreen;
}

#long {
    background-color: lightyellow;
}
```

What is happening in the CSS Code: 

1. Setting up basic paragraph styling

1. Selector for body of first paragraph

1. Set width/height/border of Box

1. Set background of long paragraph


All of the elements on the page are 'static' positioned right now
- default, everything scrolls normally

---
Options besides static/default: 

- `fixed`: Puts the element in 1 fixed location

    - Typically avoid this setting, there are better options!

    ``` css
    #box {
        position: fixed;
        top: 10px;
    }
    ```

- These settings will have the green box 10 pixels from the top, even when you scroll down:

    ![9](./figures/css/9.png)

- More examples: 

    ``` css
    #box {
        bottom: 10px; /*Will be stuck to the bottom*/
    }
    ```

    ``` css
    #box {
        left: 100px; /*Will be 100px from the left side*/
    }
    ```

- `relative`: Stick the element where it would have been normally, but then offset using top/left 
    - Simple/easy to use

    ``` css
    #box {
        position: relative;
        top: 5px;
        left: 100px;
    }
    ```

- `sticky`: Mixture between relative/fixed
    - My words: "Starts relative, becomes fixed"
    - The idea here is to keep the element where it was at the start

    ``` css
    #box {
        position: sticky;
        top: 1px;
    }
    ```

    - Great for things you always want access to: 
        - Navigation bars
        - 

    - Beware: You don't want it to block things below it on the page
        - Some older browsers also don't support `sticky`

- `absolute`: Very similar to position `fixed`
    - Difference: When you scroll, it will stay where it was on the page
        - Absolute to: where it is on the page of the document 
        - Not Absolute to: Browser window 

    - This is not always the case!
        - If the parent of (or anything above) an `absolute` element, will instead be absolute to that parent item

        - Example: 

        ``` css
        section {
            position: relative;
        }

        #box {
            position: absolute;
            top: 0px;
            left: 100px;
            
        }
        ```

        - Notice how it is now 0 pixels from the top and 100 pixels from the left of this new section ie. the top of the long paragraph:

            ![10](./figures/css/10.png)

            - Not from the spot it was on the page before, which in this case using `fixed` had it 0/100 from the top/left of the entire webpage:

                ![11](./figures/css/11.png)

                - (Remember: The Green Box is inside of a `section`)

        - Next Question... What if you want the element to not be on top of the elements, like this here where the green box is on top of the long paragraph?

            - Answer: z-index

            ``` css
            long {
                z-index: 2;
            }
            ```

            - What this does: 

                - When you save, nothing happens (stacking context: we need to create a new one when we use z-index)

                ``` css
                long {
                    position: relative;
                    z-index: 2;
                }
                ```

                - Doing this will lead to the green box now being behind the long paragraph: 

                ![12](./figures/css/12.png)

                - For proof, bump up the green box by 10 pixels so that we can now see it: 

                ``` css
                #box {
                    top: -10px;
                }
                ```
                ![13](./figures/css/13.png)

            - Note: z-index sets the order

                - "Z-indexes compete with each other"

            - Examples:

            1. Box on top
            ``` css
            #long {
                z-index: 2;
            }

            #box {
                z-index: 3;
            }
            ```

            1. Long paragraph on top
            ``` css
            #long {
                z-index: 4;
            }

            #box {
                z-index: 3;
            }
            ```
     
    - One more property of note: `float`
        - Similar to position, removes elements from normal flow
        - Allows elements to flow around other elements
            - Very powerful, can do it with multiple items

        - What float does:
            - Take this element and push it to one side of the container (left in the upcoming example)
            - Allow the elements below it to wrap around it wherever there is empty space on the other side

        - Example: The paragraph will now wrap around the box

        ``` css
        #box {
            float: left;
        }
        ```
        ![14](./figures/css/14.png)
        ``` css
        /*Also, ensure these settings too since we are not using position OR z-index rn: */
        section {
            /*position: relative;*/
        }
        #box {
            /*position: absolute;*/
            /*z-index: 3;*/
        }

        #long {
            /*position: relative;*/
            /*z-index: 4;*/
        }
        ```

        - Sometimes you need not all of the elements to listen/pay attention to float: `clear`
            - "I just want to go below what is floating on the left and the right"
                - To clear the left, you also have to clear the right one

        ``` css
        #long {
            clear: both; /**/
            clear: both; /*Go below item that is floating right*/
        }
        ```

Takeaways/Closing thoughts
- Try to use position sparingly
    - Especially avoid fixed/absolute 
    
    
# Lesson 11: Stacking Contexts

CSS goes 3D!

(This video is about how Z-index actually works in CSS)

# Key Term

## Stacking Context
A group of elements positioned together on the z-axis
- Stacking Contexts can be nested within other Stacking Contexts
- `z-index` values are used to determine the layering/ordering of elements
    - Only elements with the same *stacking context parent*

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_positioned_layout/Understanding_z-index/Stacking_context

# Notes from the video: 

Example Output: 

![15](./figures/css/15.png)

CSS Code: 

``` css
/*Boxes*/
#red {
    z-index: 1;
    background-color: red;
}

#blue {
    z-index: 2;
    top: 100px;
    left: 150px;
    background-color: blue;
}

#green {
    z-index: 3;
    top: 200px;
    left: 40px;
    background-color: green;
}

/*Basic Properties*/
div {
    position: fixed;
    width: 200px;
    height: 200px;
    border: 5px solid black;
    padding: 0.5rem;
    color: white;
    font-size: 2rem;
    font-weight: bold;
}
```

Current State:
- Z index is in order visually (everything is stacked)

- The `position: fixed` argument for `div` is what has created the stacking context
    - There are other ways to create the stacking context

    - Other examples of creating stacking context: 
        - `position: sticky`
        - `position: relative`
        - `transform` 


Stacking Context
- Grouping of elements on the Z-axis
    - In the example above, each is acting as its own stacking context
        - Each value is position fixed
        - "How high up in the z-axis is this stacking context?"
            - When each element has its own stacking context, the 1-2-3 makes sense 

            - What happens if we create a stacking context for the section? ie. 

            ``` css
            section {
                position: fixed;
                z-index: 4;
            }
            ```

            - Answer: Green gets pushed to the back/bottom

                ![16](./figures/css/16.png)

            - Shouldn't green be ahead since it has z-axis 1 and red/blue have 2/3?

                - This part of the .html explains: 

                ``` html
                <section>
                    <div id="red">Red</div>
                    <div id="blue">Blue</div>
                </section>
                <div id="green">Green</div>
                ```

                - This entire `section` is a stacking context
                    - Remember: position is fixed right now

                - Outside of `section` ie. Green is a completely different stacking context 
                    - This is a sibling stacking contexts
                        - This is because they are on the same level (root level) within the stacking context ie. highest level besides the base document's stacking context

            - Back to the example...

            - `section`:  z-index of 4 
                - It will be above anything that has a value less than 4

            - `#green`:  z-index of 3
                - It will be below anything that has a value of 4 or greater 

        - Moral of the story: `#red` and `#blue` have z-index of less than 3, but because they are inside of `section` (which has z-index of 4), they are 

            - `#red` and `#blue` are compared to each other WITHIN their stacking context parent (`section`)
                - This is also why Blue is on top of Red! (2 > 1)

                ![16 again lol](./figures/css/16.png)

            - What happens if we change the z-index of blue to -1?

            ``` css
            #blue {
                z-index: -1;
            }
            ```

                - Answer: Blue is now behind red 
                
                    - Note: Still ahead of green, since Blue's parent (`section`) is still ahead of Green (4 > 3)

                ![17](./figures/css/17.png)
            
Ending Notes on Stacking Context
- Tons of ways to create a stacking context
    - If you are running into bugs, you might have more/less stacking contexts than you are currently aware of!


# Lesson 12: Flexbox

Commonly known as the following: 
- "I can finally position things"
- "CSS ain't so bad"
- "wow, I haven't punched my monitor today"

# Key Term

## Flexbox
A layout model particularly useful for building responsive designs with row/column layouts 
- Also known as "Flexible Box Layout Module" 

- An element can be made a *flex container* with this `display: flex`
    - All of its children will automatically be laid out as *flex items*

- For flex containers, these are some of the common properties used to layout their flex items: 

    - flex-direction: Determines which direction is the *main-axis*, either `row` or `column`

        - Additionally, `row-reverse` and `column-reverse` can be used to reverse the order of flex items

    - justify-content: Determines how elements are positioned along the *main-axis*

        - Possible values: 
            - `flex-start`
            - `flex-end`
            - `center`
            - `space-around`
            - `space-between`
            - `space-evenly`

    - align-items: Determines how elements are positioned along the cross-axis (the one selected by `flex-direction`)

        - Possible values: 
            - `flex-start`
            - `flex-end`
            - `center`
            - `baseline`
            - `stretch`

    - flex-wrap: Determines if flex items can wrap to new lines

        - Possible values: 
            - `wrap`
            - `nowrap`
            - `wrap-reverse`
                - used to wrap flex items with the lines in reverse order

    - align-content: Determines how lines are positioned along the cross-axis when flex items are wrapping on multiple lines

        - Possible values: 
            - `flex-start`
            - `flex-end`
            - `center`
            - `space-around`
            - `space-between`
            - `stretch`

    - `flex-flow`: A shorthand for `flex-direction` and `flex-wrap`
            
    - `gap`: Determines the amount of space between flex items
        - This can take 1 or 2 length values
            - If given 2, they will be treated as a row gap and a column gap, respectively 

            - Alternatively, a `row-gap` and `column-gap` property can be specified to individually set the gap between rows/columns

- For flex items, these are some of the common properties to position themsevles:

    - `align-self`: Overrides the `align-items` value used for the flex container

    - `flex-basis`: Sets the initial size of the flex item along the main-axis 
        - (essentially this will act as width for the row axis and height for the column axis)

    - flex-grow: Determines if the flex item is able to grow into extra space
        - If value is 0: Flex item will not grow
        - If value is NOT 0: Flex item will take up as much extra space as possible
            - The higher the value, the more the flex item will grow and take up more space

        - Example: 

            - Item A has a value of 1
            - Item B has a value of 2
                - Item B will take up 2x as much extra sapce 
                    - Note: This does not mean it will be 2x as large - Only that it will take up 2x the extra space!

    - flex-shrink: Determines if a flex item is able to shrink in the case that the flex items are too large for the container 
        - If value is 0: Flex item will not shrink
        - If value is NOT 0: Flex item will shrink as small as possible
            - The higher the value, the more the flex item can potentially shrink 

    - flex: Shorthand property for `flex-grow`, `flex-shrink` and `flex-basis` (in that order)

    - order: Moves the flex-item to a different location amongst the other flex items, rather than using the order defined in the DOM

        - All flex items default to having a value of 0

        - If value is -1: Would move an item before all other items that have not changed their order

        - If value is 1: Would place item at the end    

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Flexible_Box_Layout

# Notes from the video: 

Flexbox
- Layout system for building responsive websites
    - "Allows us to build websites that will re-size based on the size of the window"
    - Creates a great user experience, regardless of the screen sizes!

Example Output: 

![18](./figures/css/18.png)

CSS Code: 

``` css
section {
    height: 90vh;
    border: 2px dotted black;
}

.red {
    height: 75px;
    background-color: red;
}

.green {
    height: 125px;
    background-color: green;
}

.blue {
    height: 100px;
    background-color: blue;
}

/*Generic Styling*/
div {
    border: 5px solid black;
    padding: 0.5rem;
    color: white;
    font-size: 2rem;
    font-weight: bold;
}
```

What is going on in this example: 

- 

Getting into the actual Flexbox

What Flexbox is:

- Allows us to do the following:

    - Define a flexbox container: Whatever you set to `display: flex` becomes the flexbox container

        - The items inside of it are now flex items

- Example: 

    - Flexbox container: `section`

        - This would make all 3 `div` items in `section` become flex items, changing the way they will be laid out on the page: 

        ``` css
        section {
            display: flex;
        }
        ```
        
        ![19](./figures/css/19.png)
        
        - All of the div's will now be on 1 line instead of stretching out the entire page, the stretch the width of their content

            - This is a default property of flexbox


        - Note: This only affects direct children of `section`

            - Nested items are not flex items themselves



Properties of flexbox: 

- `flex-direction`: 

    - `flex-direction: row`: Put all flex items horizontally (in a row)
        - main axis = horizontal
        - cross axis = vertical
    
    - `flex-direction: column`: Stack the flex items vertically (on top of each other)
        - main axis = vertical
        - cross axis = horizontal

    - `flex-direction: row-reverse`: Put all flex items horizontally (reverse order, throws everything to the right)

        ![20](./figures/css/20.png)

    - `flex-direction: column-reverse`: Stack the flex items vertically (reverse order, throws everything to the bottom)

        ![21](./figures/css/21.png)


- `justify-content`: Changes how the items are ordered/presented

    - `justify-content: flex-start`: Put everything at the start of the main axis

    - `justify-content: flex-end`: Put everything at the end of the main axis

    - `justify-content: space-around`: Evenly space out the elements

        ![22](./figures/css/22.png)

    - `justify-content: space-between`: Same as space-around, except doesn't put space around the elements (they get pushed all the way to the edge)

        ![23](./figures/css/23.png)

    - Combining properties:

        ``` css
        section {
            display: flex;
            flex-direction: row-reverse;
            justify-content: flex-end;
        }
        ```

        ![24](./figures/css/24.png)


- `align-items`: Just like `justify-content`, but for the cross-axis

    - `align-items: flex-end`: Goes to the end of the cross axis

    - `align-items: flex-end`: Goes to the center

        - Example of easy way to center all direct children: 

        ``` css
        section {
            display: flex;
            flex-direction: row;
            justify-content: center;
            align-items: center;
        }
        ```

        ![25](./figures/css/25.png)

        - There is no space between these items though... here's how to fix that!

- `gap`: Flexbox's version of margin, good way to get even spacing between items

    - It lets you choose the gap between items (instead of setting them all individually)

    - `gap: 10px`: Puts 10 pixels between each flex item in the container

        ``` css
        section {
            display: flex;
            flex-direction: row;
            justify-content: center;
            align-items: center;

            gap: 10px; /**/
        }
        ```

        ![26](./figures/css/26.png)


Examples with more than 3 flex items: 

Note: We changed the HTML's Body: 

``` html
<body>
    <section>
        <div class="red">Red</div>
        <div class="green">Green</div>
        <div class="blue">Blue</div>   
    </section>
</body>
```

=> 

``` html
<body>
    <section>
        <div class="red">Red</div>
        <div class="green">Green</div>
        <div class="blue">Blue</div>
        <div class="red">Red</div>
        <div class="green">Green</div>
        <div class="blue">Blue</div>
        <div class="red">Red</div>
        <div class="green">Green</div>
        <div class="blue">Blue</div>  
    </section>
</body>
```
    
![27](./figures/css/27.png)

- We have to scroll to see everything

    - Overflow from flex container!

    - How do we fix this? 


- `flex-wrap`: Changes how the values wrap around when overflowing

    - `flex-wrap: nowrap`: Default value, this is how we see it right now where the values are overflowing
        - Not ideal!

    - `flex-wrap: wrap`: Goes to a new line when you run out of space

    - `flex-wrap: wrap-reverse`: Similar to `row-reverse`, you still get a wrap effect, just in reverse order

        ![28](./figures/css/28.png)


- `flex-flow`: Lets you use flex-direction/flex-wrap in the same call

- Example: These are equivalent, just shorter syntax:

    ``` css
    section {
        flex-direction: row;
        flex-wrap: wrap;
    }
    ```

    ``` css
    section {
        /*flex-direction: row;
        flex-wrap: wrap;*/
        flex-flow: row wrap;
    }
    ```

Now that we have multiple rows, we need to have a way to choose how close the rows will be together!

- We used `align-items` for this; but, when we have a `flex-wrap`, only align items wtihin their individual rows: 

    - See how the are pushed to the top of their rows with this code: 

    ``` css
    section {
        display: flex;
        flex-flow: row wrap;
        justify-content: center; 

        justify-content: center;
        align-items: flex-start;
    }
    ```

    ![29](./figures/css/29.png)

    - How to fix this?


- `align-content`: Allows you to have more control over where the rows go

    - `align-content: center`: Puts rows all the way in the center

    - `align-content: space-between`: Same as before

    - `align-content: space-around`: Same as before


That is pretty much all for flex container!


Properties for How to change how a single flex item is aligning in the group:
(Let's use the red class as an example)

- `order`: Where in the order do we want this item to be

    - `order: 0`: Default value, everything stays as-is (Everything is in the order set in .html/the DOM)

    - `order: -1` Pushes all values to the beginning of the order

    ``` css
    .red {
        order: -1;
    }
    ```

    ![30](./figures/css/30.png)

    - `order: 1` Pushes all values to the end of the order

    ``` css
    .red {
        order: 1;
    }
    ```

    ![31](./figures/css/31.png)


- `flex-grow`: If there is extra space, how much of it should this element take up?

    - `flex-grow: 0`: Default value, everything stays as-is (nothing will take up extra space!)

    - `flex-grow: 1`: When there is extra space, this element will take up as much extra space as possible

        - Look at how the red element steals all of the space in the bottom row (where there was lots of extra space):

        ![32](./figures/css/32.png)

        - Note: On the 1st line, there is no extra space to take up, so nothing changes

        - These values are proportions, as seen in the following code example with red AND green having values of >= 1:

        ``` css
        .red {
            flex-grow: 1;
        }

        .green {
            flex-grow: 2;
        }
        ```

        ![33](./figures/css/33.png)

        - Notice how green takes up 2x as much space than red, and blue still takes up 0!
    

- `flex-shrink`: Whether or not this element is able to/allowed to shrink

    - `flex-grow: 1`: Default value, It is allowed to shrink!

    ``` css
    .green {
        width: 100vw;
        flex-shrink: 1;
    }
    ```

    ![34](./figures/css/34.png)

    - Notice how green is not taking up 100vw, it is just taking up the size of the parent/container

    - `flex-grow: 0`: This element CANNOT shrink.

    ``` css
    .green {
        width: 100vw;
        flex-shrink: 0;
    }
    ```

    ![35](./figures/css/35.png)

    - Notice how green is now overflowing out of the container!


- `flex-basis`: This is however much space I want to take up, in whatever the main axis direction is

- Examples: 

    - Green elements getting 100vw in height:

    ``` css
    section {
        display: flex;
        flex-flow: column wrap;
    }


    .green {
        flex-basis: 100vw;
        flex-shrink: 0;
    }
    ```

    ![36](./figures/css/36.png)

    - Note: If we move `flex-shrink` back to 1, they will go back to simply filling up the entire space: 

        - (It is less than their flex-basis width)

    ``` css
    .green {
        flex-shrink 1;
    }
    ```

    ![37](./figures/css/37.png)


- `flex`: Short hand for flex-grow, flex-shrink, and flex-basis

- Example: These are equivalent, just shorter syntax:

    ``` css
    section {
        flex-grow: 1;
        flex-shrink: 0;
        flex-basis: 200px;
    }
    ```

    ``` css
    section {
        /*flex-grow: 1;
        flex-shrink: 0;
        flex-basis: 200px;*/
        flex 1 0 200px;
    }
    ```

    - Explanation: 

        - `flex-grow: 1`: Allow the green elements to grow, if there is extra space

        - `flex-shrink: 0`: The green elements cannot shrink down to a smaller size than their `flex-basis`
        
        - `flex-basis: 200px`: This is the smallest size the green elements can be 

            - Since there are more than `200px` of space in each row, see how the green elements grow beyond that

            ![38](./figures/css/38.png)

        - What happens if `flex-basis` is `2000px`?

            - "I have a base size of 2000 pixels, I can grow if there is more space than that, and I am not allowed to shrink"

            ![39](./figures/css/39.png)

        - What happens if `flex-shrink` is `1`?

            - "This can shrink, and now the green elements will shrink back down to the size of the container"

            ![40](./figures/css/40.png)


That is all of the flexbox properties that you need to know!

Takeaways: 
- A bit of a learning curve to thinking in flexbox
    - Which elements need to be `flex containers`?
    - Which elements need to be `flex items`?
    - Which `flex properties` do we need to set to get elements to lay out exactly how we want them to?
    
- All in all, super intuitive way to lay out pages
    - Everything will grow and flex 
    - Great way to get responsive websites
    - Sizes change depending on space on the screen

# Lesson 13: CSS Grid

Grid Layout
- "I have complete positional mastery over any 2-D space"
- "CSS is actually awesome"
- "so this is what true happiness feels like."

# Key Term

## CSS Grid
A layout model used for creating responsive layouts of multiple rows and columns

- An element can be made a *grid container* with `display: grid`

    - All of its direct children will automatically be laid out as *grid items* in a single *cell*

- *grid area*: Rectangular sub-section of a grid

- *grid lines*: The dividers between each row and column

- *tracks*: The rows/columns created by *grid area* and *grid lines*


Common Properties for grid containers, used to layout their grid items: 

- `grid-template-columns`: Determines the number of columns and their sizes

    - The unit `fr` can be used as a fractional unit here to create a responsive design

- `grid-template-rows`: Determines the number of rows and their sizes

    - The unit `fr` can be used as a fractional unit here to create a responsive design

- `grid-template-areas`: Creates names for grid areas that grid items can place themselves in 

- `justify-content`: Determines how grid tracks are aligned along the `inline-axis` (row)

- Possible values: 
    - `start`
    - `end`
    - `center`
    - `space-around`
    - `space-between`
    - `space-evenly`

- `align-content`: Determines how grid tracks are aligned along the `block-axis` (column) 

- Possible values: 
    - `start`
    - `end`
    - `center`
    - `space-around`
    - `space-between`
    - `space-evenly`

- `align-items`: Determines how grid items are aligned in columns (ie. the *block-axis*) 

- Possible values: 
    - `start`
    - `end`
    - `center`
    - `stretch`

- `justify-items`: Determines how grid items are aligned in rows (ie. the *inline-axis*) 

- Possible values: 
    - `start`
    - `end`
    - `center`
    - `stretch`

- `place-items`: A shorthand for both `align-items` and `justify-items` 
    - 1 value provided: applies to both
    - 2 values provided: applies to `align-items`, then `justify-items`

- `gap`: Determines the amount of space between grid items
    - 1 length value provided: Can use `row-gap` or `column-gap`
    - 2 length value provided: Row gap, column gap (respectively) 


For grid items, these are some of the most common properties used to position themsevles: 

- `grid-column-start`: Determines what column this item starts on (Based on a line number)

- `grid-column-end`: Determines what column this item end on (Based on a line number)

- `grid-column`: Shorthand for both `grid-column-start` and `grid-column-end`
    - Specified in the format `start / end`

- `grid-row-start`: Determines what row this items starts on (Based on a line number)

- `grid-row-end`: Determines what row this items ends on (Based on a line number)

- `grid-row`: Shorthand for both `grid-row-start` and `grid-row-end`
    - Specified in the format `start / end`

- `grid-area`: Places the item in a grid-area based on a name created in `grid-template-areas`

- `align-self`: Overrides the `align-items` value used for the grid container

- `justify-self`: Overrides the `justify-items` value used for the grid container

- `place-self`: Shorthand for both `align-self` and `justify-self`
    - In the same format as `place-items`

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Grid_Layout

# Notes from the video: 

CSS Grid
- Different way to layout using CSS
    
    - Usually used for 2D layouts

    - While Flexbox was good for laying out elements that scale naturally with screen size, CSS Grid has more properties control over exact locations elements will end up in

        - Especially when there are more rows/columns

Example Output: 

![41](./figures/css/41.png)

CSS Code: 

``` css
body > * {
    border: 5px solid lightblue;
}
```

What is going on in this example: 
- CSS
    - Light blue borders on all direct children of the body
        - Each direct child will be the direct grid items

- HTML
    - Heading
    - Body
        - Header

        - Main
            - Heading
            - Content Paragraph

        - Aside
            - Paragraph

        - Footer
            - Paragraph

Goal: 
- Change the layout:
    - `heading`
    - `aside` content next to `main` content
    - `footer`
- We could do this with Flexbox, but it would be more difficult



Getting into the actual CSS Grid

How to turn the body into a CSS Grid Container:

``` css
body {
    display: grid;
}
```

In this example: 

- Grid Container: Body
- Grid items (all direct children): 
    - Header
    - Main
    - Aside
    - Footer

Properties we commonly set: 

- `grid-template-columns`: How many columns do we want/how large do we want them to be

    - Space separated sizes for each column

    Example: 

    ``` css
    body {
        display: grid;
        grid-template-columns: 100px 200px 100px;
    }
    ```

    ![42](./figures/css/42.png)

    - See how there is left column of `100px`, middle of `200px`, and right of `100px`

    - This is not ideal: We had 4 grid items and 3 columns, so we end up with 2 rows since the footer had to get pushed down

- Implicit Grid: The browser decided how many rows we need based on # of items we have

    - How to change this? Explicit Grid!

    ``` css

    ```

    ![]
    
- Fractional Unit: The hardcoding of pixels is typically a bad idea, so we will use fractional units (`fr`) to 

    - What it means: "Take up as much space as I can, proportional to other `fr` units"

    ``` css
    body {
        grid-template-columns: 1fr 2fr 1fr;
    }
    ```

    ![43](./figures/css/43.png)

    - Notice how the entire width is now spanned, and Main is 2x larger than left/right!

    - One issue with `fr`: Sometimes, the columns can get too small (especially w/ small browser windows)

        Remedy: Wrapping `grid-template-columns` in `minmax`:

        ``` css
        body {
            grid-template-columns: minmax(1fr) 2fr 1fr;
        }
        ```

        ![44](./figures/css/44.png)

        - See how now, the Top Level Heading column got bigger 

            - Thisis because `200px` > `1fr` in this situation

                - If we change to `20px`, it will still stay at `1fr`, which is good!

- `grid-template-rows`: How many rows do we want/how large do we want them to be

    - Space separated sizes for each column

        Example: 

        ``` css
        body {
            display: grid;
            grid-template-columns: 3fr 1fr;
            grid-template-rows: 1fr 3fr 1fr;
        }
        ```

        ![45](./figures/css/45.png)

        - See how we cannot see the 3rd row yet (no content has been pushed there yet)

            - How to choose where in the grid the content will go: Our next topic!



Note: These are both the same:

``` css
body {
    grid-template-rows: 1fr 3fr 1fr;
}
```

``` css
body {
    grid-template-rows: repeat(3, 1fr);
}
```

Note: `Track`: Column OR Row

We have figured out how to size our elements, but now we need to actually lay out/position our elements where we want them!

- `grid-column-start`, `grid-column-end` and `grid-column`: Where does this column start/end

    - Column in this case: The column lines (between the individual columns)

    Example:

    ``` css
    header {
        grid-column-start: 1;
        grid-column-end: 3;
    }
    ```

    ![46](./figures/css/46.png)

    - Notice how the Heading is now spanning over 3 column (from 1-3)

        - This would be the same as our code above: 

        ``` css
        header {
            grid-column-start: span 2;
        }
        ```

        - "Take up 2 columns, from this spot!"
            
            - It naturally starts at 1, so 1 + 0 is the default, but 1 + span2 means it will cover 3 total

    - Best way to do this: `grid-column`

        - The following examples means the same thing: 

        ``` css
        header {
            grid-column-start: 1;
            grid-column-end: 3;
        }
        ```

        ``` css
        header {
            grid-column: 1 / 3;
        }
        ```

    - Giving grid lines names

        - It can be confusing remember the 1's and 3's from above. These two examples both would have the same result: 

        ``` css
        body {
            display: grid;
            grid-template-columns: 3fr 1fr;
            grid-template-rows: 1fr 3fr 1fr;
        }

        header {
            grid-column: 1 / 3;
        }
        ```

        ``` css
        body {
            display: grid;
            grid-template-columns: [left] 3fr [middle] 1fr [right];
            grid-template-rows: 1fr 3fr 1fr;
        }

        header {
            /*grid-column: 1 / 3;*/
            grid-column: left / right;
        }
        ```

        

- `grid-row`: Same as `grid-column`

    - 
    
    We don't want to do this, but here's an example of how to push an element down to the 2nd row: 

    ``` css
    header {
        grid-row: 2;
    }
    ```

There is another way besides grid-column and grid-row to choose where an element ends up in the Grid system: 

- `grid-template-areas`: Named *areas* that items can go into

    - Nice because it keeps all of the layout information in 1 place

        - The instructor prefers this method!

    - Area: Rectangular portion of the grid (A sub-section)

        - a

    Example similar to the ones above: 

    ``` css
    body {
        display: grid;
        grid-template-columns: [left] 3fr [middle] 1fr [right];
        grid-template-rows: 1fr 3fr 1fr;
        grid-template-areas:

        /*Col 1*//*Col 2*/
            "header header"   /*Row 1*/
            "main aside"        /*Row 2*/
            "footer footer";     /*Row 3*/
    }

    header {
        grid-area: header;
    }

    main {
        grid-area: main;
    }

    aside {
        grid-area: aside;
    }

    footer {
        grid-area: footer;
    }
    ```

    ![47](./figures/css/47.png)

    And if we wanted to switch header and aside, so that aside was on the left: 

    (Simply switch the order to 'aside main')

    ``` css
    body {
           /*Col 1*//*Col 2*/
            "header header"     /*Row 1*/
            "aside main"        /*Row 2*/
            "footer footer";     /*Row 3*/
    }
    ```

    ![48](./figures/css/48.png)


That's all there really is to laying out CSS elements in the CSS Grid!

Extra properties to change how the grid is going to look + how the individaul grid items will work within the grid:

- `gap`: Puts space between the grid units
    
    - Works how it does in Flexbox

        ``` css
        body {
            gap: 10px;
        }
        ```

        ![49](./figures/css/49.png)


- `justify-items`: 

    - `justify-items: center`: Centers items so they don't fill up the entire page 

- `align-items`: 

    - `align-items: center`: Vertically centers the items

- `place-items`: `justify-items` and `align-items`

    - Example: `place-items: center`

Note: You can put these on either the entire body, or just an individual item!

- To put them on yourself: 

    - `justify-self: center`
    - `align-self: center`
    - `place-self: center`

That is all of the properties for CSS Grid!

One last thing: 
- You can use nesting
- Examples: 
    - Flex boxes inside of grids
    - Grids inside of flex boxes
    - More!

- Example of this: Main as both a grid item and flex box:

``` css
main {
    display: flex;
    grid-area: main;
    
    flex-direction: column;
    /*
    justify-content: center;
    align-items: center;
    */
}
```

In general, this is how we will lay out ALL of our content:

- Grids for 2D layouts

- Flexboxes for single row layouts/ single column layout

    - Could also be used for multi-column / multi-row layouts (not recommended)

        - Be careful with this: flex-wrap has less control over where exactly the wrapping will happen ie. which elements will be on which lines


# Lesson 14: Working With Images

Are images content or style?

# Key Term

## Image Sprite

A group of images all included in a single image file.

- These images are usually split on the client using the CSS `background-image` property, along with the `background-position`

- Primary benefit of sprites: 

    - Reduce the total file size
    
    - Reduce the # of files the client needs to download

        - These will both decrease page load times!


# Notes from the video: 

Working With Images
- How and when to use image tags

    - You can also do image tags in HTML, so that's the issue

Are images content or style?

- Content: HTML
    - Image is part of the context

- Style: CSS
    - Removing it would not change the page's meaning

        - These are not absolute rules - always use your best judgement!!


Primary way in CSS: 

`background-image`: Primary way to add an image in CSS

- Takes relative/absolute path as argument

- Sets image as background of the element

    - ie. it will go behind other content if that element has more content

- Properties: 

    - `background-clip`: Where the image will be clipped off/cropped, based on box model

        - `background-clip: padding-box`: causes the background to extend just outside the padding (but not to the border)

        - `background-clip: border-box`: will extend to outside of the border
        
        - `background-clip: conntet-box`: content will only be size of the content

        - `background-clip: text`: background will only be around the text

            - Is not used very often due to low # of use cases

        - More on `background-clip`:

            - This property also works for background colors if we want them to extend to different part of box model


    

    - `background-origin`: Where the background start

        - `background-origin: padding-box`: Top-left corner of background image will be at top-left of the padding

            - Usually, you'll set `background-origin` to the same as `background-clip`

                - Not always tho!

        - More on `background-origin`:

        - It differs since it cannot have text as a value

    - `background-repeat`: Specifies if they background should repeat, if the element is larger than the background image

        - Values: `repeat` or `no-repeat`


    - `background-size`: Specifies the size of the image

        - Usually, it goes as 2 space-separated values: 

            - Width
            - Height

        ``` css
        main {
            background-size: 50% auto;
        }
        ```

        - `auto`: scales the images while keeping its natural proportions/size

            - Aspect ratio doesn't change!

        - `cover`: Scales image / stretches it as large as possible to fill the container

            - Crops out any portions that end up outside of the elements
            
        - `contain`: Will make the image as large as possible, without cropping OR changing proportions


Image Spriting: Include multiple images in 1 file

- Then, the splitting up that file on the client before displaying it to the user

    - More bandwidth efficient

        - Tradeoff: It can make the code less readable

- Use `background-position` to "get" individual images out of the larger image

    - How: Property was intended to move a background back inside of the image container, but with clever sizing it can be used just to use a certain portion of the larger image that you want


Code Editor Example: 

CSS Code: 

``` css
#algoexpert {
    width: 300px;
    height: 200px;
    border: 10px dashed black;
    padding: 10px;
    background-image: url("algoexpert.png");
}
```

Output: 

![50](./figures/css/50.png)

- See how this image is super cropped and all we can see is the top 

    (It is overflowing out of the box)

    For reference, original photo: ![algo expert logo](./figures/algoexpert.png)


How to fix this: 

- `background-size`: This will make the image itself bigger/smaller

    - `100px`

        ``` css
        #algoexpert {
            background-size: 100px 100px;
        }
        ```

        - Note: It will repeat automatically, and because your new image is tiny at `100px` by `100px`, it does
        
        ![51](./figures/css/51.png)

    - `contain`: Stretch it as long as it possibly can, without having to change the aspect ratio / proportions

        ``` css
        #algoexpert {
                    background-size: contain;
                }
        ```

        - 

        ![52](./figures/css/52.png)

    - `cover`: Fill out the entire container, crop the rest of it out 

        ``` css
        #algoexpert {
            background-size: cover;
        }
        ```

        - 

        ![53](./figures/css/53.png)


- `background-repeat`: Fixing repeating

    - `repeat`: The default

    - `no-repeat`: Make it not repeat

        ``` css
        #algoexpert {
            background-size: contain;
            background-repeat: no-repeat;
        }
        ```

        ![54](./figures/css/54.png)


- `background-origin`: Decide where your image is going to start

    - `border-box`: Starts at the top left

        ``` css
        #algoexpert {
            background-origin: border-box;
        }
        ```

        ![55](./figures/css/55.png)

- `background-clip`: Decides where your image gets clipped

    - `border-box`: Image gets clipped to the size of the content

        ``` css
        #algoexpert {
            background-origin: border-box;
            background-clip: content-box;
        }
        ```

        ![56](./figures/css/56.png)

        - We lose the edges of the image here

            - This is because the background clip is smaller than the background border box

Note: A good way to the image inside of the border is with this combo

``` css
#algoexpert {
    background-origin: padding-box;
    background-clip: padding-box;
}
```

![57](./figures/css/57.png)


How to take advantage of "Sprite" or "Spriting" we learned about earlier: 

Go back to the HTML and un-comment the following sections: 
1. HTML
1. CSS

Once you get the `sprites.png`, your page should look like this before proceeding: 

![58](./figures/css/58.png)

Note: 
- Blue: CSS-3
- Red: HTML-5

Goal: Have the `div` for CSS and the `div` for HTML to have the image from the Sprite inside of them

How to do so: 

- Push the HTML logo over to the left, so it is next to the html `div`

``` css
#html {
    width: 256px; /*We know size of images*/
    height: 256px;
    background-image: url(sprites.png);
    background-position: -286px -10px;
}
```

- Push the CSS logo over to the right, so it is next to the css `div`

``` css
#css {
    width: 256px; 
    height: 256px;
    background-image: url(sprites.png);
    background-position: -10px -10px;
}
```

- Remove image tag since we no longer need the full image with both in them:

``` html
<!-- <img src="sprites.png" alt="html and css sprites" />
```

- Final step: Right now, the HTML/CSS `div`'s are being used as images

- What we want: We want to declare that explicity!

``` html
<div id="html" role="img" aria-label="HTML Logo"></div>
```

``` html
<div id="css" role="img" aria-label="CSS Logo"></div>
```

Final product: 

![]

- Note: the `aria-label` has nothing to do with this section, but it is good practice catering for those reading screens!


Takeaways from this section: 

- Using HTML vs. CSS: Total Grey Area!

    - Most of the time: 

        - img tag in HTML
        - edit those tags/width/height in CSS

    - Also acceptable for using CSS: 

        - `background-image`

        - image spriting


# Lesson 15: CSS Inheritance

Much like biological organisms can pass down traits,

CSS elements pass down properties from parent to child

# Key Term

## CSS Inheritance

How elements choose a value when none has been explicitly declared in any stylesheet.

- All properties are either inherited or non-inherited

    - Inherited: Take parent's value

    - Non-Inherited: Take `initial` value

- While the default groupings of inherited/non-inherited is usually all that's needed, this can be changed by using any of these values for any declaration: 

    - inherit: The value should inherit from its parent, regardless of if it normally an inherited property.

    - initial: The value should be set to the default value of CSS specification.

        - Note: This is oftentimes different than browser defaults

    - unset: The value should be set to `inherit` if it is normally inherited; otherwise, `initial`

        - This can be useful for "resetting" browser defaults from the user agent stylesheet

    - revert: The value should revert back to the next stylesheet in the cascade

        - For author stylesheets, this would act as if the author did not write any declaration for the property

            - But, it would still honor the user agent and user stylesheets as normal

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/inheritance


# Notes from the video: 

CSS Inheritance


Basic example setup:

Heading and button: 

``` html
<main>
    <h1>Inheritance</h1>
    <button>Click Me</button>
</main>
```

Basic stylesheet:

``` css
main {
    color: red;
    border: 2px solid black;
}
```

![60](./photos/60.png)

- Questions about this: 

    - Why is H1 (Inheritance) red when it wasn't made that in the selector?

    - Why is H1 getting the color, but not the border?

    - Why isn't the button colored?

        - Answer to all: 2 things

            1. Inheritance

            1. User stylesheet (browser)


Every property in CSS is either inherited, or not.

- Inherited: Defaults to parent's value, if it hasn't been set

    - Goes up parent tree to find a set value 

    - Examples: 

        - Color

- Non-Inherited: Defaults to parent's value, if it hasn't been set

    - Only looks at itself

    - Examples: 

        - Border


This makes sense, but then why isn't the button red?

Example with inspect/code to show: 

![61](./figures/css/61.png)

- Even though color is an inherited property, this button's user agent stylesheet is already setting a color!

    If you scroll down further...

    ![62](./figures/css/62.png)

    Meanings of this photo:
    
    - Crossed out: Color is crossed out, meaning that it is being over-written by the user agent stylesheet

    - Greyed out: Border is faded/greyed out, meaning that it is a property that is not usually inherited

        - You can change this behavior if you'd like


Example of changing behavior for over-written/non-inherited properties: 

``` css
button {
    color: inherit;
}
```

- This will overwrite the user agent stylesheet, causing the button to have red text: 

    ![63](./figures/css/63.png)


If you want, you can change this behavior for the border too, even though it is a non-inherited property:

``` css
button {
    color: inherit;
    border: inherit;
}
```

![64](./figures/css/64.png)

More properties that work similarly to `inherit`

- `initial`: Looks at just the CSS Spec ie. says the following:

    - "Don't worry about the user style agent sheet OR inheritance, just go look at CSS specification"

        - In this example, CSS Specification has black for buttons, so it will become that 


- `unset`: If this is inherited by default, just inherit; If not, go to the initial value from CSS Spec 

    - Very useful for un-doing what the user agent stylesheet does

    Example

    ``` css
    button {
        border: unset;
    }
    ```

    This removes the `border` from the user agent style sheet

    - Because border is not an inherited property, it goes all the way to the initial value from CSS Spec ie. no border

- `revert`: Looks at the style sheet(s) above in CSS Cascading

    Example: 

    ``` css
    button {
        border: revert;
    }
    ```

    This is the author stylesheet
    
    - What if the author did not declare the property?
    
        Now it will go back to the user agent and user stylesheets as normal


This is a powerful property to use with what we just learned:

- `all`: Look at every single property and set them all to this value

    Example: 

    ``` css
    button {
        all: unset;
        border: revert;
    }
    ```

    We have lost all of the user agent stylesheets
        
    - (besides border, since `revert` has made it go back to the user agent stylesheet)

    - Without this, it would just inherit everything from main!

    ![65](./figures/css/65.png)

    - The properties also all look like regular text now

        - This is because we have inherited it from the header



Takeaways: 
- CSS Spec = Defaults

- Most of the time: Don't need to worry about inheritance

    - It will work how we expect it to

    - Good to know for scenarios where something looks weird because of 1 of the following 2 reasons: 

    1. User agent stylesheet is overriding values that we expected to be inherited

    1. A property that we thought was an inherited property, actually is not


# Lesson 16: Responsive Design

AlgoExpert is a perfect example of a beautifully responsive website

- Resize your browser all you want, the layout will not break!

# Key Term

## Mobile First Design

Building websites or applications with mobile devices as the primary use case - Then, scaling them up to larger devices with a responsive CSS

- In general, it is easier to scale a design up to larger screen than the opposite (scale large ones down to small)

- Along with massive growth of mobile phones/browsing, this makes a mobile 1st design a great dev. workflow!

# Notes from the video: 

Responsive Design 
- How to use CSS Media Queries to make our websites more responsive/scale to different screen sizes

Example w/ CSS Grid setup: 

![66](./figures/css/66.png)

This output looks fine on our system, but our grid layout is not going to make sense on a smaller screen!

- Chrome gives you the option to change your screen size with the development tools

    - How to setup Devtools in Chrome:

        1. Inspect: Ctrl-Shift-I

        1. Toggle devie toolbar: Ctrl-Shift-M 

- Notes: Why do we use Devtools?

    - Speeds up the debugging process

        - Instead of going back and forth between writing code/tabbing to browser/refreshing page to see changes

            - If you are stuck on a tricky bug, the feedback loop is sped up and it helps a lot with speed

    - Visual work in the browser

        - You want to see the results of your changes as quickly as possible

            - Feedback loop is important

        - It is why designing in the broswer is possible

    - Pick apart any website!

        - See how it was made

        - See why browser is rendering the way it is

    - References: 
    
    - https://devtoolstips.org/tips/en/simulate-devices/#:~:text=You%20can%20do%20it%20even,Shift%2BM%20on%20macOS).

    - https://www.youtube.com/watch?v=V8op4qMmSsk

    - https://developer.chrome.com/docs/devtools/open/


- See what happens when you do that, it looks horrible and essentially we are just zooming out:

![67](./figures/css/67.png)

How to fix this? 

- Go back to HTML and add meta tag: 

    ``` html
    <head>
        <meta 
        name="viewport" 
        content="width=device-width, initial-scale=1" />
        <!-- NoteL This was already here...
        <title>Inheritance</title>
        <link rel="stylesheet" href="styles.css">  -->
    </head>
    ```

    This defines the way that the viewport is going to scale.

    This is a very typical mobile-optimized site's HTML!
    
    We learned about this in the HTML crash course, but reminders: 

    - `<meta>`: Meta tags define metadata about an HTML document

        - Metadata = information about data

            - These always go inside of the `<head>`, since they specify things such as the following: 

                - Character set
                - Page description
                - Keywords/Author
                - Viewport settings

            - Not displayed on the screen, but used by browsers and is machine parsable 

    - `name="viewport"`: Lets HTML know we want a viewport meta tag

        - The browser's view point is the area of the window in which the web content can be seen

            - Often, not same size as rendered page, so browser provides (scrollbars to access all content)

    - `content="width=device-width, initial-scale=1"`: 

        - `width`: Controls the size of the viewport

        - `initial-scale`: Controls the zoom level when the page is first loaded


Now that we have written the right HTML, we need to write responsive CSS!

Adding media queries:

First, hat exactly is a media query?

According to Tim:

- Media Query: We want to run some CSS, based on a condition.

    - Usually: These conditions are min/max screen sizes

        - There are more, but not focusing on that now!
        
- My definition: A conditional ie. use this if the condition is TRUE, otherwise ignore this code

Example: 

``` css
@media (max-width: 800px) {
    body {
        grid-template-columns: 1fr; /*Normal value for mobile devices - since they are skinny*/
        grid-template-rows: 1fr 1fr 3fr 1fr 1fr;
        grid-template-areas:
        "header"
        "nav"
        "main"
        "aside"
        "footer";
    }
}
```

In this example, the conditional is that the max-width is `800px` 
("The max width allowed here is `800px`")

- If width < 800px, run this code.

- If width >= 800px, you can ignore this code.

Testing it out:

When we load this in our browser, it looks normal:

![68](./figures/css/68.png)

BUT... when we re-size the window to be smaller than `800px`, look what happens!

![69](./figures/css/69.png)

Notice with the red box, the width dropped below `800px`

This is the power of the responsive design really showing for the first time.

- Note: On smaller screens, we usually use 1 column for the `grid-template-columns` w/ only `1fr` since mobile devices are very skinny


We can also use multiple media queries on the same page, based on different screen sizes

- Make sure to have the numbers descending, as with smaller screens we want to be even more concise

Example: Putting this below the code for the `800px` one:

``` css
@media (max-width: 600px) {
    aside {
        display: none;
    }

    body {
        grid-template-columns: 1fr; /*Not necessary, its the same!*/
        grid-template-rows: 1fr 1fr 3fr 1fr;
        grid-template-areas:
        "header"
        "nav"
        "main"
        /*"aside" Remove this from the areas */
        "footer";
    }
}
```

What is going on here:

- The aside is not that important, so we are not showing it. We do this by the following: 

    - Set `display: none` for the aside

    - Remove the row that was being used by aside in `grid-template-areas`

    - Remove `aside` from the arguments for `grid-template-areas`

    ![70](./figures/css/70.png)

    - Not necessarily a great idea just removing something, but good for demonstrations

        - Should probably show it in a better way next time


General debugging tip: If your media queries are not working, make sure you have the meta tag in your HTML!!

This would not work, for example:

``` html
<head>
        <!-- <meta 
        name="viewport" 
        content="width=device-width, initial-scale=1" /> -->
        <title>Inheritance</title>
        <link rel="stylesheet" href="styles.css">
    </head>
```


Finally, the concept known as Mobile First Design:

What is Mobile First Design?

- First: Build a website that is optimized for a mobile device

- Second: Add media queries to make it work on larger browsers

    - This is not what we did today, but just to note

    - Why do we prefer mobile first design?

        1. It is easier to scale UP then Down

        1. More and more of the internet is being consumed from mobile phones nowadays

How to change what we did today into a mobile first design:

- Put the CSS from the 800px media query into the regular code

- Put the regular CSS code down at the bottom in a media query with the args `min-width: 800px`

    - "If you are larger than 800px, scale up"


Takeaways:
- CSS Media Queries are super powerful
- Use them as often as possible!


# Lesson 17: Animations

The cool animations scattered across the AlgoExpert website that are "pretty neat"... all come from CSS

# Key Terms

## Transitions

A CSS Module for smoothly transitioning between values when a value is changed.

Transitions can be defined with a combinations of these properties: 

- `transition-property`: The name of the CSS property

- `transition-duration`: How long it takes

- `transition-timing-function`: How the transition should progress.

    Can take a variety of keyword values, such as: 

    - `linear`

    - `ease-in`

    - Custom values using `cubic-bezier()` or `steps()`


- `transition-delay`: How long to wait before starting

Alternatively, the `transition` property can be used as shorthand for all of these.

The order: 

1. duration
1. delay
- after that, the order doesn't matter!

Example: This would do the following:
- set the width to smoothly transition linearly
- it would take 1 second
- it would occur 2 seconds after the value is changed

``` css
transition: width 1s linear 2s;
```

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Transitions

## Animations

A CSS module for animating properties 

- Very similar to transitions, but with more control!

An animation is defined using keyframes, as well as these other properties: 

- `animation-name`: The name of the keyframes animation

- `animation-duration`: How long it will take

- `animation-fill-mode`: If the element should stay in its animated position after the animation completes OR if it should move back to the starting position
    
    - Specified with `backwards`, `forwards`, or `both`

- `animation-direction`: Whether the animation goes in 

    Values: 

    - `normal`
    
    - `reverse`

    - `alternate`: used to switch between `normal` and `reverse`

    - `alternate-reverse`: start w/ `reverse`, end with `normal`

- `animation-iteration-count`: How many times to run the animation

    - `infinite` is an option


- `animation-play-state`: Tells us if the animation is currently `running` or `paused`.

    - Particulary useful for pausing an animation using JavaScript!

- `animation-timing-function`: How the animation should progress through the keyframes.

    Can take keywords, such as: 

    - `linear`

    - `ease-in`

    - Custom values using `cubic-bezier()` or `steps()`


- `animation-delay`: How long to wait before starting


Alternatively, the `animation` property can be used as shorthand for all of these.

The first time value will be used for the duration, the 2nd used for a delay. After that, the order doesn't matter 

- assuming the `animation-name` is not using a conflicting keyword with another possible value

The order: 

1. duration
1. delay
- after that, the order doesn't matter!

Example: This would do the following:
- 2 second delay
- run the move animation over 3 seconds duration
- use the ease timing function
- animation will run indefinitely, alternating order each time

``` css
animation: move 3s ease infinite alternate 2s;
```

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Animations


## @keyframes

A keyword for defining points within an animation timeline.

An animation is made up of a variety of keyframes

- The browser will fill in spaces between the keyframes based on the timing function

Keyframes are used with this syntax:

``` css
@keyframes animation-name {
    from {
        property: value;
        property: value;
    }

    50% {
        property: value;
        property: value;
    }

    to {
        property: value;
        property: value;
    }
}
```

The `from` and `to` keywords are equivalent to `0%` and `100%`
- `from` = `0%` 
- `to` = `100%`

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/@keyframes

# Notes from the video: 

CSS Animations

Example: 

``` html
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Animations</title>
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <div>Animations</div>
    </body>
</html>
```

``` css
div {
    background-color: lightblue;
    width: 30%;
    height: 6em;
    border-radius: 12px;
    padding: 12px;
    margin: 4em;
}
```

![71](./figures/css/71.png)

2 ways to create CSS Animation:

1. `Transition` Property - Allows you to transition from one property value to another

Example: Take width and expand to a wider width

- You can make the transition smooth, if you want

2. `Animation` Property - Similar, but gives you more granular control of how things are working


Let's start by making a transition: 

We want the width of this `div` to change once it has been hovered over.

``` css
div:hover {
    width: 50%;
}
```

It works, but looks ugly because it just jumps out to 50% instantly

How do we fix this? 

- Smooth transitions with `transition`:

``` css
div {
    transition-property: width;
    transition-duration: 1s;
}
```

This makes it MUCH smoother than before.


- `transition-property`: Chooses what kind of transition

- `transition-duration`: How long it will take


One top of these 2 properties, there are 2 other properties we can define a transition with: 

- `transition-timing-function`: Defines how exactly it is going to happen

    - `linear`: Perfectly smooth and linear

        - Speed is constant/doesn't change

    - `ease`: Ease into it 

        - Much smoother

    - ``: Maybe something else!

- `transition-delay`: How long we wait until the animation occurs

    - Example: `1s`


You can also simply use `transition`:



``` css
div {
    transition-property: width;
    transition-duration: 1s;
    transition-timing-function: ease;
    transition-delay: 1s;
}
```

``` css
div {
    transition: width 1s ease 1s;
}
```

(These are the same thing)

Next: What if I want to transition more than 1 property?

Example: I want to do the following when hover occurs:
- Change Width
- Transform
    - Moves elements around on the page

``` css
div:hover {
    width: 50%;
    transform: rotate(180px);
}
```

Done, Right? Wrong.

In the div {}, we have only mentioned that we hope to change the width! We need to change the following line of code:

Current state:

``` css
div {
    transition: width 1s ease 1s;
}
```

Fixed (Way #1): 

``` css
div {
    transition: all 1s ease 1s;
}
```

- The `all` tells CSS to listen to every value we want to change 

Fixed (Way #2): 

``` css
div {
    transition: width 1s ease 1s, transform 1s ease 0s;
}
```

- This is more precise

    - Notice how I changed the delay time to 0s for the transform: We have more control doing it this way!

Let's look at it working!

![72](./figures/css/72.png)

Note: Remember that rotation will happen first, as it has a 0s delay on it.

That's all there is to transitions!
- easy
- straightforward
- very powerful nonetheless

    - Can account for most of the animation-type effects that we would want

        - Especially based on state

            Examples of state: 

            - hover

    - Can also be control by JavaScript

        Example: Button is clicked, add a CSS class to create the transition for us


When we need more granular control + functionality, we will turn to `animation` property!

Note before starting: Remove your code from the examples using transitions:

``` css
div {
    background-color: lightblue;
    width: 30%;
    height: 6em;
    border-radius: 12px;
    padding: 12px;
    margin: 4em;
/* 
    transition: width 1s ease 1s, transform 1s ease 0s;
}

div:hover {
    width: 50%;
    transform: rotate(180deg);
} */
```

Animation in CSS

`animation`: 

    - Uses @keyframes to 

- `@keyframes`: Defines all of different values for the animations at different points in time 


Example of creating an animation that changes halfway (50%) of the way there

``` css
@keyframes move {
    50% {
        transform: translate(200px, 0px);
    }

    100% {
        transform: translate(200px, 300px);
    }
}
```

Note: This animation will do the following: 
- halfway there: `translate` will  

    - It has capabilities to move the element in both the x/y direction

- all the way there: `translate` will move the element in both the x/y direction

Don't forget to go back up to `div` and add the `animation` property so that `div` will listen to the @keyframes and know what to do!

``` css
div {
    animation-name: move;
    animation-duration: 3s;
}
```

Results: 

Start: (0% there):

![73](./figures/css/73.png)

Step 1 (50% there): 

![74](./figures/css/74.png)

Step 2 (100% there): 

![75](./figures/css/75.png)

Nicely done! The animation returns to where it started

- What if we want the element to stay over there in the bottom right?

    - This is where `animation-fill-mode` comes in 


Example code: 

``` css
div {
    animation-name: move;
    animation-duration: 3s;
    animation-fill-mode: forwards;
    animation-direction: reverse;
    animation-iteration-count: 2;
    animation-play-state: running;
}
```

Once I hover over this elements, it will go from the end point to the start point (2x)

- It kinda teleports back to the end point between iteration 1 and 2, that is ugly, note for later I guess

Explanation of properties/variables:

- `animation-fill-mode`: Allows us to choose if the elements stays where it ends, or goes back to where it started

    - `forwards`: Starts and ends like normal 

    - ``: 

- `animation-direction`: Chooses if the element goes from start > end, or end > start

    - `reverse`: Starts at endpoint, ends at startpoint 

    - ``: 

- `animation-iteration-count`: How many times to run the animation

    - 3: Will go back/forth 3 times, then stop animating

    - `infinite`: Keeps going as long as page is open/CSS is running

- `animation-play-state`: How many times to run the animation

    - `paused`: Will pause if we stop hovering

    - `running`: Will keep going if we stop hovering

    - Note: Super useful with JavaScript 

        - If we ever have a button we want users to click to to stop animation

            - We don't use this directly in CSS much (if we don't have JavaScript to change the value, its just not going to work OR be in default state of `running`) 

Just like transitions, we can set a timing function:

- `animation-timing-function`: Works same way as with transitions

    - `linear`: works as usual
    
    - `ease`: works as usual

    For the special ones...

    - `cubic-bezier()`: A function on the x/y plane

        - The steeper the slope, the faster the animation will run at that point of the animation

            Example: (Note, it takes 2 sets of x/y pairs)

            ``` css
            div {
                animation-timing-function: cubic-bezier(0.2, 0.6, 0.6, 0.2);
            }
            ```

            - Don't worry about this much, just know what it is

                - You won't usually derive this by hand

    - `steps`: How many steps should be taken to between the values (rather than a smooth transition)

        - It glitches around the screen in steps 

        Example: 

            ``` css
            div {
                animation-timing-function: steps(3);
            }
            ``` 

Finally, looking at shorthand notations: 

- `animation`

``` css
div {
    animation: move 3s forwards reverse 2 running steps(3);
/* 
    animation-name: move;
    animation-duration: 3s;
    animation-fill-mode: forwards;
    animation-direction: reverse;
    animation-iteration-count: 2;
    animation-play-state: running;
    animation-timing-function: steps(3); */
}
```

- `@keyframes`: Can use the following shortcuts if you want: 

    - `to` = `100%`

    - `from` = `0%`

Two examples that are the exact same:

``` css
@keyframes move {
    50% {
        transform: translate(200px, 0px);
    }

    100% {
        transform: translate(200px, 300px);
    }
}
```

``` css
@keyframes move {
    from {
        transform: translate(0px, 0px);
    }

    50% {
        transform: translate(200px, 0px);
    }

    to {
        transform: translate(200px, 300px);
    }
}
```

Well, that's it for Animations!
- "Incredibly powerful tools with just CSS alone"


# Lesson 18: CSS Variables

You can declare variables in CSS
- I had no idea

# Key Term

## Custom Properties

(Also known as variables)

Used to keep track of repeated values in CSS

- Custom variables start with `--` and can be included in any ruleset

- Most commonly: They are defined on the `:root` ruleset so the variables will be accessible throughout the website

- Custom properties are then used with `var()` CSS Function

Example: This code defines a custom property called `--main-color`, and uses it for a background color!

``` css
:root {
    --main-color: #00334C;
}

main {
    background-color: var(--main-color);
}
```

Learn more: https://developer.mozilla.org/en-US/docs/Web/CSS/Using_CSS_custom_properties

# Notes from the video: 

Starting Example:

HTML:

2 Main Sections: 

![76](./figures/css/76.png)

CSS Code: 

``` css
h1 {
    color: #00334C;
}

h2 {
    padding: 12px;
    color: white;
}

main {
    display: flex;
    border: 5px solid black;
    gap: 12px;
    width: 412px;
}

section {
    flex-basis: 200px;
    flex-shrink: 0;
    flex-grow: 0;
    background-color: #00334C;
}
```

Explanation: 

Header 1's
- Dark blue text

Header 2's
- Padding
- White text

Main
- Flextable
    - becomes the flexbox container w/ flex items inside
- Black border
- 12px Gap between elements
- Width of 412px

Section
- flex-basis of 200px
    - ie. Sets the initial size of the flex item along the main-axis (width in this case)

- flex-shrink of 0
    - ie. Flex item will not shrink

- flex-grow of 0
    - ie. Flex item will not grow

- Dark blue background color

We proceed...

What issues do we see with this CSS file?

1. The same color is repeated in `h1` and `section`

Just like in regular coding, we don't want to re-write any code 

- It is bad practice

- Remedy: Use a global variable

2. Hard coding `412px` in `main`
This isn't inherently bad, but when you know that reason why it is:

We have 2 sections, both are 200px: 200px*2 = 400px

We also have a gap between the 2 section: 1*12px = 12

Add these together: `412px`

- Remedy: Use a global variable 


How to make a global variable?

`:root` psuedo-class
- It makes variables accessible throughout the whole document

    - We could also use `html` tag, but this is better right now

``` css
:root {
    --main-color: #00334C;
}
```

Now that we have this main color, change the prior CSS Code in `h2` and `section` to reflect the change:

``` css
h1 {
    color: var(--main-color);
}

section {
    background-color: var(--main-color);
}
```

Change the main color and see what happens!

``` css
:root {
    --main-color: pink;
}
```

![77](./figures/css/77.png)

Perfecto!

Next issue: Where we hard-coded values for width:

``` css
:root {
    --section-size: 200px;
    --flex-gap: 12px;
}

main {
    gap: var(--flex-gap);
    width: calc((var(--section-size) * 2) + var(--flex-gap))
}

section {
    flex-basis: var(--section-size);
}
```

The output looks the exact same now.

Note: Make sure to wrap equations and global/root variable with `calc()`


Let's change the size of `--section-size` and `--gap-size` and see what happens~

``` css

```

![78](./figures/css/78.png)

Perfecto!

One last thing:

If we changed `:root` to `main`, it would only affect things inside of the `main` tag.

``` css
main {
    --main-color: purple;
    --section-size: 300000px;
}
```

Actual last thing:

Something that comes with CSS by default is `:root`, there are other options that we won't cover.


# Lesson 19: Frameworks and Preprocessors

Frameworks and preprocessors are like super steriods for your style sheets

Use them! (Your code will be unstoppable)

# Key Terms

## CSS Framework

Pre-written code that can be used to simplify development.

Oftentimes, these include:

- Ready to use classes

- Pre-built components

- Responsive layout systems

## Preprocessor

A program that converts code of another syntax into CSS that the browser can understand.

Usually, these add new features to CSS to make the code...

- Easier to read

- Easier to write

- Easier to maintain


# Notes from the video: 

Frameworks vs. Preprocessors

Framework: Pre-written code

Preprocesso: Add language functionality

![79](./figures/css/79.png)


To set expectations:

- We won't discuss individual frameworks

- High level similarities and differences

Oftentimes, you hear framework as a generic term, but there are 2 categories of tools we are discussing here.

1. Frameworks: Pre-written code to speed up development 

- Pre-written stylesheets

- Pre-written components 

2. Preprocessor: Adds funcionality to the language 

- Converts another language of code into CSS

- Adds nice features and speeds up development

- Good Quality code


Examples of common frameworks: 

Tailwind: Customizable utility classes to use in HTML for pre-made CSS

- Used very frequently throughout the industry

Example: Create classes for us of each of the different background colors we may be using on our website

- Then, add those classes to the HTML elements that need them
    
    - They will have the background color (we won't need to write CSS manually)

- Results of tailwind:

    - Don't need to write much CSS Code at all

    - Easy to build design that are responsive 

        - The styling information being inside of HTML may turn some users away (HTML files can get harder to read)


Bootstrap: Responsive pre-built components, grid layout system

- Arguably the most popular CSS Framework
    
    - Developed by Twitter to develop consistent designs that are responsive 

    - Comes with a variety of components to quickly make a professionally viable website w/ little effort

    - Due to its popularity, you may want to be careful using its components (it will look basis)

- Has an extremely powerful grid layout system
    
    - Somewhat similar to CSS's built-in version

    - Makes building high quality layouts extremely easy

- Another downside: You have to add a large CSS file to your webiste

    Results of this:

    - Slow page loading times

    - Difficult to customize components

        - You might need to do searching to see what to override


Materialize: Follows Google Material UI Design System

- Similar to Bootstrap

- Google Developers were inspired by concept of paper and ink

    - Focus on making design that felt familiar, even when on a screen

        - This design system has been extremely successful for Google

- Comes with many pre-built responsive components that you can use directly in your website.

    - Good for a professional feel right out of the box

- Drawbacks: 

    - Websites need to follow Google Material UI Design System

        - Throughout, so there is consistency with components

        - Also its biggest strength

    - In general, still a well-thought out design 

        - Be conscious/careful of being consistent with their principles


Foundation: Highly flexible UI components

- Grid system for responsive design 

- Easier to customize than the other frameworks

    - Remember: The deciding factor is which is best for YOUR use-case, so this doesn't necessarily matter


Bulma: CSS only framework

- Most CSS Frameworks require that you have some of their JavaScript code on your website 

    - Bulma doesn't do this

        - They are less opinionated about the implementation of your components

        - Purely is focused on assisting with styling!

- Least popular on the list

    - More work to get up and running. 

        Why?

        - Writing more Javascript code than other options


Takeaway from this section:

- These are just a few of the frameworks out there

- Tons more to explore

    - Beware: Many are similar, so these got popular for a reason (they are the best!)


Common Preprocessors

Note before starting: 
- Not as many out there

    - Still tons of options


Sass: Langauge extension of CSS

- By far the most popular 

- Provides its own syntax

    - Good for more functionality

- Examples for what it has:

    - Variables
    
    - mixins
    
    - @extends
    
    - nesting
    
    - looping


Less: Similar to Sass

- Easy to learn

- Comparison to Sass:

- JavaScript based while Sass is Ruby

- Less popular than Sass

- They both have similar features


Stylus: Similar to Sass, just different syntax

- Focuses on making the syntax simple

    - All punctuations marks are optional

        Examples: 

        - braces

        - colons / semi-colons

        - commas


- Appealing for those with Python background

    - CSS becomes much more similar to Python when you use Stylus Processor


PostCSS: Highly customizable plugin collection

- JavaScript based

- Much different option

    - High focus on customization

- Comes with a lot of plugins

    - Can choose which ones you want to use to transform your CSS

        - This is almost like building your own preprocessor for your specific project

            Example: Parse your CSS and make it work on various version of browsers


When should I use these??

Frameworks: It depends

Good: 
- For small teams
- For quick development
- If you want to focus on features

Bad:
- If you want to re-invent the wheel
- There is value in building out your own components to have your website feeling unique

Overall:
- Many large companies still use frameworks
- Make sure you are putting in the substantial work to customize to have it fit with your own style


Preprocessors: Almost always yes!

Good: 
- Sass is great
    All of them do the following:
    - Easier to write
    - More maintainable 
    - Less likely to contain bugs

Bad:
- Nothing wrong with using normal/pure CSS
- New CSS coders may want to learn it better by doing all of this by hand
    - Tools can steal learning exp.


# CSS Methodologies And Best Practices

Congrats, you're almost there

Final video: 
- Advanced methodologies
- High-level concepts

Now we will know how to write good CSS!

# Key Terms

## BEM - Block, Element, Modifier CSS methodology

Breaks CSS Classes into 3 categories: 

1. Blocks: Standalone elements with their own meaning.

- Referenced simply by the name of the block

    Example: `class="menu"`

1. Elements: Parts of a block without their own meaning.

- Referenced by the name of the block, two underscores, then the name of the element

    Example: `class="menu__item"`

Modifiers: Flags to change styles for blocks or elements, such as *disabled* or *selected*.

- These are prefixed by the class they modify and two dashes, and they are included in addition to that original class.

    Example: `class="menu menu--disabled"`


## OOCSS - Object Oriented CSS Methodology

Based on object-oriented programming principles

- Can be applied to CSS Class Design by treating UI components as objects.

    Styles are the given one of the two categories:

    - Structure: "Invisible" properties such as width/margin

    - Skin: "Visible" properties such as color/border

Along with separating structure and skin into classes, OOCSS makes a clear distinction between **content** and **containers**

- Containers should function the same (Regardless of the content inside of them)

- Content should not depend on the container it is nested within


## Atomic CSS 

A CSS Methodology based on the idea of minimizing any repeated declarations

- Rather than creating classes based on components, Atomic CSS creates utility classes based on single declarations

    Example: in an Atomic CSS, a "margin-12" class might be created that adds 12 pixels of margin

    - Rather than including that declaration on ALL of the components needing 12 pixels of margin

    - **Stack overflow**: "Atomic operation" means an operation that appears to be instantaneous from the perspective of all other threads. You don't need to worry about a partly complete operation when the guarantee applies.

## SMACSS - Scalable and Modular Architecture For CSS

Note: SMACSS aka "Smacks"

Methodology that splits CSS into 5 different categories, each of which get their own file: 

- Base: Page defaults

    - Usually just type selectors

- Layout: Major structural layout of the page, using ID and class selectors

    - Classes are prefixed with `l-` or `layout-`

        Example: Navigation element might have the class `l-nav`

- Module: Smaller re-usable components

    - Usually using class selectors without any name prefixes

- State: Specific states for layouts or modules

    - Usually using class selectors

        Examples: `disabled`, `selected`

- Theme: Style rules for layouts and modules related to a theme

    - Oftentimes, based on user preferences ie. dark mode

## ITCSS - Inverted Triangle CSS Methodology

Methodology that mostly focuses on the order of CSS Code, rather than having opinions on naming conventions.

Primary idea here: Have generic styles, which should have the largest reach across elements and the least specific selectors.

- The exact layers of the triangle can be changed to fit the needs of a specific project

General structure looks like this: 

- Settings: Global variables affecting the entire website

- Tools: Mixins and functions for use with preprocessors

- Generic: High level generic styles

    - Usually to reset browser defaults for consistency across browsers

- Elements: Defaults for elements using type selectors

- Objects: The most generic classes

    - Oftentimes, for larger containers

- Components: Classes for individual UI components

- Trumps: `!important` overrides

    - Only use when they are needed!

# Notes from the video: 

CSS Methodologies and Best Practices

Ultimate Goal: What is good CSS?
- How do we write CSS that scales to large projects, but still is easy to maintain

Common Themes Across: 

Stay consistent:

- Should be easy to find code in your codebase

- You should assume classes exists for a given components

Keep separation from HTML: 

- Minimize how much we intrude on HTML

- Optimal outcome: We have an HTML file that looks like raw markup

    - No style information whatsoever

        - Many methodologies sacrifice this (for other benefits)

Focus on responsive design:

- Avoid using absolute values

- Will ensure our websites probably scale regardless of website

Respect the cascade, avoid `!important`:

- This will prevent us from writing "CSS hacks"

    - There is usually a better solution

    - Some methodologies will solve this by minimizing the difference in specificities in selectors

        - We can also ensure that we are using cascading + specificity rules as they were intended by CSS Spec

Don't repeat your code ie. use variables, group similar components: 

- DRY = Don't repeat yourself!

    - "There’s also a general principle called the Rule of Three. Martin Fowler popularized it and attributed it to Don Roberts. It basically states that two instances of duplicate code don’t require refactoring. But when you need to repeat the code a third time, then it’s time to refactor the code into an abstraction."

- Use variables for repeated styles

- Group similar components w/ common classes


Specific Implementations w/ Methodologies:



## BEM - Block, Element, Modifier CSS methodology

Breaks CSS Classes into 3 categories: 

1. Blocks: Standalone elements with their own meaning.

- Referenced simply by the name of the block

    Example: `class="menu"`

1. Elements: Parts of a block without their own meaning.

- Referenced by the name of the block, two underscores, then the name of the element

    Example: `class="menu__item"`

Modifiers: Flags to change styles for blocks or elements, such as *disabled* or *selected*.

- These are prefixed by the class they modify and two dashes, and they are included in addition to that original class.

    Example: `class="menu menu--disabled"`

    You can also do this with the menu__item:

    Example: `class="menu__item menu__item--selected"`


Upsides of BEM: 

- It makes our CSS very easy to write and maintain

- Only using classes helps to avoid issues w/ specificity

    - By making every selector in CSS a class, every selector has the same specificity!

Downsides of BEM: 

- Causes our HTML to get pretty long 

    - Verbose class names like `class="menu__item menu__item--selected"` don't help!

- It does restrict our code 


## OOCSS - Object Oriented CSS Methodology

Components as "Objects"

- Structure: "Invisible" properties such as width/margin

- Skin: "Visible" properties such as color/border

Content vs. Containers

- clear distinction between **content** and **containers**

    - Containers should function the same (Regardless of the content inside of them)

    - Content should not depend on the container it is nested within

Upsides of OOCSS
- 

Downsides of OOCSS:
-  Lots of small classes
    - Makes HTML code less readable 
    - Similar to BEM

## Atomic CSS 

Concept: Avoid any repeated declarations

- Make classes for them

    - Many single declarations

    - Names based on function

Example: Paragraph with
- Medium-Sized Text
- Blue Font
- 12px of margin

``` css
class="text-med text-blue margin-12"
```

Good for: 
- DRY CSS (no repeats)
Bad for: 
- Separating CSS from HTML


## SMACSS - Scalable and Modular Architecture For CSS

Note: Might not need all 5 for every project

Splits CSS into 5 different files: 

- Base: Page defaults

    - Usually just type selectors

- Layout: Major structural layout, using ID and class selectors
    - Classes are prefixed with `l-` or `layout-`
        Example: Navigation element might have the class `l-nav`

- Module: Smaller re-usable components
    - Usually using class selectors with no name prefixes

- State: State for layouts or modules
    - Usually using class selectors passed with `is-`
        Examples: `is-disabled`, `is-selected`

- Theme: Style rules for modules/layouts related to a theme
    - Oftentimes, user preferences ie. dark mode
        - Many websites won't need this at all

## ITCSS - Inverted Triangle CSS Methodology

![80](./figures/css/80.png)

About ordering of CSS Code
- Not opinions like naming conventions

Primary idea: Start with generic selectors
- They will reach the most elements on the page
    - Hence, the top of the triangle having the longest reach


General structure: 

- Settings: Global variables affecting the entire website
    - Has the most reach
        - Least Specific / Least Explicit

- Tools: Mixins and functions 
    - If you are using a preprocessor that supports those

- Generic: Generic layer
    - "High level generic styles"
    - Usually to reset browser defaults
        - Ensures consistency across browsers

- Elements: Type selectors

- Objects: The most generic classes
    - Oftentimes, for larger containers

- Components: Holds style for individual UI components
    - A majority of our CSS goes here

- Trumps: `!important` overrides
    - Make SURE they are at the bottom
        - Only use when they are needed!

Takeaways: 
- These are not the only layers possible for the triangle
    - Principle of organization would still apply w/ more or less

More Takeaways on this entire chapter: 
- Following a CSS Methodology can be a great way to ensure you have consistent/scalable CSS Code
- At the same time, don't feel restricted!
    - Many projects will combine between methodologies
        - Whatever makes sense for your use case, and this is OK!


Performance Concerns
(in other words: how to minimize page load times)

- Know that rowsers read CSS from right to left:

    Example: `#specific > p`

    - The browser will look at every paragraph in the entire page!

- Avoid expensive properties
    - ID's are the fastest, but that would be horrible code
        - Hard to maintain

    Examples to avoid:
    - `box-shadow`
    - `transform`
    - `position: fixed`
    - `:nth-child`
    - etc.

    - Note: Browsers are really fast, so don't worry too much about this
        - Difference between performance of selectors usually is not a big deal in the modern web
        - Prioritize clean code!

- Avoid unused code
    This does the following:
    - Wastes the browser's time
    - Increases file size

    This sounds simple but happens in a couple of ways:
    - Deleting HTML code, then deleting to delete the CSS it was related to
    - When a website gets extremely large and has all its CSS in one file
        Example: Amazon
        - If Amazon gave all of its code to the browser at 1 time, it would take forever to load

Learning point: Only give the browser the CSS Code that you need at the given time ie. the page you are currently on!
- Or, components/pages the user is likely to navigate to soon

- Minimzize CSS Files
    - These will remove whitespace and other wasted characters
        - Keeps file sizes smaller
        - Important for larger projects
            - Particularly if using a framework like Bootstrap

- Defer non-essential CSS 
    - It will prevent render blocking 
        - Note: What are render-blocking resources? Render-blocking resources are portions of code in website files, usually CSS and JavaScript, that prevent a web page from loading quickly.

        - If we have styles that are not necessary on the initial page, place them in another file and defer loading them
            - Example: Styles for mobile page 

            - There are a few ways to do this, but they're all a bit "hacky":
            1. Change relationship from stylesheet to pre-load
            - Tells the browser to load this in as soon as possible
                - Then we incldue `as=` so it knows it is a style sheet

            ``` css
            <link rel="preload" as="style" href="styles.css" onload="this.onload=null; this.rel='stylesheet'" />
            <noscript>
                <link rel="stylesheet" href="styles.css">
            </noscript>
            ```

Closing Thoughts
- There are other methodologies out there, but they all tend to cover the same principles
- Performance is not as important due to the modern web
    - This micro-optimizations do absolutely nothing usually
        - Not worth sacrificing trade-offs like code maintainability

Note: Right before JavaScript Crash Course, I decided to put figures in their own modules...

---
# JavaScript Crash Course

# Lesson 1 - Introduction

JavaScript is the 3rd (and arguably most important) pillar of the holy trinity of the modern web

Master it and you can breathe life into any webpage!

# Notes from the video

JavaScript
- Primary programming language of the web
- Resembles a lot of other languages
    - Java/Python
    - Has a ton of unique properties too 
        - Can really set you apart as a frontend engineer

Something different about JavaScript: Usually executed inside of the user's browser
- Other languages we run on our local computers...

Because of this:
- Pros:
    - Unique set of features we can take advantage of 

- Cons: 
    - Need to be aware of limitations of browsers

        Example: Event Loop
        - JavaScript all executes in a single thread
        - Browser uses an "event loop" to mimic concurrency
            - Understanding how this event loop works is incredibly important for interacting with asynchronous programming
                - Need it for working with APis

Note: Asynchronous programming = allows you to start a long-running task and still be responsive to other events while that task runs (rather than having to wait until that task has finishes)

Starting out: 
- Syntax
- Types
- Operators

Next - Nuanced: 
- Model for Object Oriented Programming
- How closures are used for scoping of identifiers

Last: 
- Work with browser to manipulate the document to create interactive webpages that respond to user input and communicate w/ the server 

Prepare of frontend interviews: 
- Deep knowledge of JavaScript is the most important skill
    - Very likely you will have to implement functions (just like questions on this FrontendExpert site)
    - Questions will test your understanding of his topics
        - Almost impossible to solve without specialized knowledge of how JavaScript language is working 

Also, you may be asked to write JS to add functioality to webpage
- Not to test knowledge, but practical knowledge

JS is very important!!

# Lesson 2- JavaScript Basics

# Key Terms

## JavaScript
The primary programming language of the web
- Primarily used for adding functionality to websites
- General purpose, multi=paradigm programming language with dynamic typing

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript

## Paradigm
A style of programming
- Oftentimes: languages are built with a specific paradigm in mind
    - Javascript is known as a multi-paradigm langauge (because it allows for programming in a variety of paradigms)

Major paradigms include:

- Event-driven: Functions can be made to respond to events
    - ie. when a user clicks on a an element or scrolls down the page

- Functional: Functions can be written as "pure functions" 
    - ie. functions will always have the same output for a given set of arguments
    - Support for first class and higher order functions:
        - First class functions: 
        - Higher order functions: This means that functions can be treated as normal values, passed as arguments to other functions and returned from functions 

- Object-oriented: Objects can be created as custom data stroes that inherit from each other

- Imperative: Programs can be written by explicitly describing the control flow 
    - loops/conditionals

- Declarative: Describing desired output (with implicit control flow)
    - Oftentimes: Associated with functional programming 
        - ie. using the forEach function to loop over an array, instead of a for-loop

## Primitive
The most basic data types of a language. In Javascript, there are 7 primitive types:

- Number: Numeric values
    - no difference between int/floats (integers/decimal values)
- BigInt: Integers too large to store in a number
    - Not used often
- Boolean: true/false
    - keywords in lowercase
- String: Sequence of characeters
- Symbol: A dynamically generated unique value
- Null
    - must be assigned (no value)
- Undefined
    - value has not been assigned at all

Note: JS has a `typeof` operator that can get the type of a value as a lowercase string
- Beware: This function has some special casing
    - example: `typeof function` will return "function" even though functions are just objects

Learn more: https://developer.mozilla.org/en-US/docs/Glossary/Primitive

# Notes from the video

Javascript is constantly evolving
- ECMAScript: standardized version

Javascript engine:
- Executes code in the browser
- Just in time complication (interpreted)
    - Better performance

Examples shown in the video:

### Numbers

``` js
// create a variable
// dynamic typing: you do not need to specify the type of value
let num = 10; // semicolon denotes end of line, optional (although you should use them)

// print
console.log(num);

// const = same as let, but you cannot change the value after the fact!
const num2 = 20;
// num2 = 999 this would be an error...
console.log(num2);
```

``` js
let num = 10.5;
let strNum = '10px';
console.log(Math.random());
console.log(Number(strNum));
console.log(parseInt(strNum));
```

``` js
let num = 10;
console.log('10' == num); //compares value
console.log('10' === num);//compares value AND type
```

``` js
// powers
let num = 10.5;
console.log(Math.pow(2, 3))
```

``` js
console.log(10 ** 'a'); //nan
console.log(Infinity); //infinity
console.log(-Infinity);//negative infinity
console.log(BigInt(100));//100n
console.log(100n);//100n
```

``` js
console.log(typeof 100); //number
console.log(typeof 100n);//bigint
```



### Strings

``` js
let str = 'abcd';

console.log(str); //abcd
console.log(str + 'efg'); //abcdefg
console.log(str + 1); //abcd1

console.log(str == 'abcd');   //true
console.log(str == 'abcd123'); //false
```

``` js
//template literal
console.log(`
Hey
Myles is ${23}
Newline
`)
```

``` js
let str = 'abcd';

console.log("Long string\
keeps going") //long stringkeeps going
```

``` js
let str = 'abc';

console.log(str[0]);
console.log(str.charAt(0));
console.log(str[1]);
console.log(str.charAt(1));
console.log(str[2]);
console.log(str.charAt(2));
```

``` js
let str = 'abc';

console.log(str.includes('a')); //true

console.log(str.includes('z'));//false
console.log(str.startsWith('z'));//false
console.log(str.endsWith('z'));//false
```

``` js
let str = 'abc';

console.log(str.toUpperCase()); //ABC
console.log(str.toLowerCase()); //abc
```

``` js
let str = 'abcdefg';

console.log(str.substr(1));   //bcdefgf
console.log(str.substr(1, 2));//bc

console.log(str.slice(1));   //bcdefgf
console.log(str.slice(1, 2));//b
```

``` js
let str = 'abcd';

console.log(str.padStart(3, '-')); //length of  3 min: abcd
console.log(str.padStart(10, '-'));//length of 10 min: ------abcd

console.log(str.padEnd(3, '-')); //length of  3 min: abcd
console.log(str.padEnd(10, '-'));//length of 10 min: abcd------
```

``` js
let str = '                   abcd';

console.log(str.trim()); //abcd
console.log(str.trimStart()); //abcd
console.log(str.trimEnd()); //                     abcd
```

``` js
let str = 'a,b,c,d';

console.log(str.split(',')); // returns list/array of [a,b ,c,d]
```



### Objects

``` js
//brackets: key-value pairs
//(you can re-assign values of const person, but not person)
const person = {
    name: 'Conner',
    course: 'FrontendExpert', // good practice is leaving the trailing comma!
}

console.log(person); //{ name: 'Conner', course: 'FrontendExpert' }
console.log(typeof person); //object


console.log(JSON.stringify(person)); //{"name":"Conner","course":"FrontendExpert"}
console.log(typeof JSON.stringify(person)); //string

console.log(JSON.parse(JSON.stringify(person))); //{ name: 'Conner', course: 'FrontendExpert' }
console.log(typeof JSON.parse(JSON.stringify(person))); //object

console.log(person.course); // frontendexpert

person.name = 'Myles';
console.log(person.name); //Myles
```

``` js
//Create new map
//Map: works similarly to a standard object
// - difference: Map has the following:
//     - functions for getting keys/values
//     - not restricted to keys of strings/symbols
const map = new Map();

map.set(123, 'hello');
console.log(map); //Map(1) { 123 => 'hello' }


console.log(map.get(123));

map.set(456, 'world');
console.log(map);//Map(2) { 123 => 'hello', 456 => 'world' }
console.log(map.size);//2

console.log(map.get(698888));//undefined
```

``` js
//Sets
// - only have unique values (un-ordered list)
const set = new Set();

set.add('hello');
set.add('world');
set.add('world'); // does nothing!

console.log(set); //Set(2) { 'hello', 'world' }
console.log(set.has('blah blah'));//false
console.log(set.size);//2

set.delete('hello');
console.log(set); //Set(1) { 'world' }
console.log(set.has('world'));//true
console.log(set.size);//1
```

Note on Set/Map:
- Usually used: Objects and arrays
- Sometimes: Set and Map
    
    If you need the following:
    - keys that are not strings



### Arrays

Note: Under the hood, arrrays are objects.

``` js
const arr = [1,2,3];

console.log(arr); //[ 1, 2, 3 ]
console.log(arr[0]); //1

arr.push(402020);
console.log(arr.length); //4

console.log(typeof arr); //object
```

### Functions

``` js
function addTwo(num = 99) {
    return num + 2;
}

console.log(addTwo(3)); //5
console.log(addTwo()); //101
```

Notes:
- Functions can be passed around like standard values
- Functions are objects

``` js
function addTwo(num = 99) {
    return num + 2;
}

function callFunc(func, param) {
    console.log(func(param));
}

callFunc(addTwo, 10);//12
```

``` js
function addTwo(num = 99) {
    return num + 2;
}
// it is both an object and a function...
console.log(typeof addTwo);//function
console.log(addTwo instanceof Object); //true
```


### Looping


``` js
// For loop
for (let i=0; i < 4; i++) {
    if (i==1){
        continue;
    }
    console.log(i);
} //0,2,3
```

``` js
//While loop
let i = 0;
while (i < 4) {
    console.log(i);
    i ++;
} //0,1,2,3
```

Note: This is an interesting way of having the code run BEFORE it checks the condition.

``` js
// Do loop
let i=0;
do {
    console.log(i);
    i++;
}
while (i < 0); //0
```

``` js
// For-of loop
for (const value of 'abc') {
    console.log(value);
}//a,b,c
```

``` js
const obj = {
    name: "Myles",
    course: "FrontendExpert",
}

for (const key in obj) {
    console.log(key);
} //name,course

for (const key in obj) {
    console.log(obj[key]);
} //Myles, FrontendExpert

for (const key in obj) {
    console.log(key, obj[key]);
} //name Myles, course FrontendExpert
```

``` js
// forEach loop (with arrays)
[1,2,3].forEach(function(value) {
    console.log(value);
})//1,2,3
```

Note above:
- Functions was passed in as a parameter
    - Anonymous function syntax: We did not give it a name


### Conditionals


``` js
const condition = false;

if (condition) {
    console.log('it was true!');
}
else if (condition === false) {
    console.log('it was false!');
} else {
    console.log('default');
}
```


``` js
// Switch statements
const myNum = 2;

switch (myNum) {
    case 1:
        console.log('it was 1');
        break;
    case 2:
        console.log('it was 2');
    default:
        console.log('default (it gets here even if 1 or 2)');    
}
```


``` js
const myNum = 10;

console.log(myNum > 5 ? 'Greater than 5' : 'Less than 5');
// ? meaning: if
// : meaning: else 

```


### Error Handling

``` js
throw new Error('oh no'); //throws error and does not run

console.log('we do not end up getting to this line of code...');
```


``` js
try {
    throw new Error('oh no');
} catch (error) {
    console.log(error);
}

console.log('error was caught, but code still runs after!');
```

### Comments


``` js
// Single line comment
```


``` js
/*
Multi
line
comment
*/
```


### Console function

``` js
console.log('value'); //prints regular 'value'
console.error('error message'); //prints in red
console.debug('debug message'); //rarely used

console.table(
    [[1, 2], 
    ['hello', 'world']]
)

console.count() // 1
console.count() // 2

console.countReset();
console.count(); //1

// different counts for different values
console.count(); //2, because default is already at 1
console.count('hey'); // starts new at 1

console.time();
console.timeLog(); // very short time
console.timeEnd(); //can also use this to reset the default..

console.time('longer');
for (let i=0; i < 100000000; i ++) {
    continue;
}
console.timeLog('longer'); // longer time

// Trace: logs out where we are in the code
function foo() {
    console.trace();
}
foo();
```


### Strict mode

Put this string at the top of your file:

``` js
'use strict';
```

What this does:
- Code is executed in slightly stricter manner
    - Finds bugs for us

Note: can also be used at the function level

``` js
function foo() {
    'use strict';
    x = 5;

}
foo();
```

# Lesson 3: Variables and Scoping

What do you call something that is both a paradox and a misnomer
- a constant variable

# Key Terms

## let
A keyword for declaring a block-scoped variable 
- Cannot be accessed before initialization

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/let

## var
A keyword for declaring a function-scoped variable
- Automatically initialized to `undefined` when it is hoisted

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/var

## const
A keyword for declaring a constant value
- Has same behavior as variables declared with `let`
- They cannot be re-assigned, though

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/const

## Block Scope
The behavior of a variable that is only accessible inside of the block it was defined
- Most of the time: the block will simply be the nearest pair of curly braces to the declaration

## Function Scope
The behavior of a variable that is accessible anywhere inside of the function it was defined

## Hoisting
The process by which the JavaScript engine moves variable declarations to the top of their scope ie. allocating memory for them before reaching the line of code where they are declared
- Variables declared with `var`: Initialized to `undefined` until reaching the line of code that init's the variable
- Variables declared with `let`/`const`: Not initialized - cannot be accessed before the line of code that init's it

``` js
console.log(varNum); // undefined
console.log(letNum); // reference error

var varNum = 5;
let letNum = 5;

console.log(varNum); // 5
console.log(letNum); // 5
```

Learn more: https://developer.mozilla.org/en-US/docs/Glossary/Hoisting


# Notes from the video

Variables in JavaScript and the ways we can define them.

Hosting: When a variable is declared, it goes to the top of its scope.
- Declaration happens first

``` js
// Hardly a difference
var varNum = 0;
let letNum = 0;

console.log('varNum', varNum);
console.log('letNum', letNum);
```

``` js
console.log('varNum', varNum); // undefined: it was hoisted
console.log('letNum', letNum); // cannot reference letNum before initialization!

var varNum = 0;
let letNum = 0;

console.log('varNum', varNum);
console.log('letNum', letNum);
```

Scoping:

``` js
function test() {
    var varNum = 0;
    let letNum = 0;
    console.log('varNum', varNum);
    console.log('letNum', letNum);
}

test();
```

Currently:
- varNum AND letNum are scoped to the entire function
    - This will not always be the case!

Explanation for this:

``` js
function test() {
    if (true) {
        var varNum = 0;
        let letNum = 0;
    }
    console.log('varNum', varNum);
    console.log('letNum', letNum);
}

test();
```

What happens here:
- varNum: accessible in the entire function
- letNum: NOT accessible in the entire function, only in its block
    - whether true or false, letNum is not declared once that if-statement is gone

Which is better, `var` or  `let`?
- Most of the time: let

    Why?
    - Rules that define let are more natural
        - Hoisting is un-natural
    - We do not want variables available throughout our function in places we don't want them

Var: Unlike other programming languages
Let: IS like other programming languages
- Good for someone coming from Python


One more keyword: `const`

``` js
function test() {
    const constNum = 0;
    let letNum = 0;

    letNum = 2; //good
    constNum = 4;//error!

    console.log('letNum', letNum);
    console.log('constNum', constNum);
}

test();
```

What does const do:
- It is essentially `let`, but it is constant ie. you cannot change it!
    - "Constant variable can never have an equal sign after it ever again"

Note: You can mutate constant values, just not reassign them:

``` js
function test() {
    const arr = [1,2,3];

    arr.push(4); // good
    console.log(arr);

    arr = [1,2,3,4] //error
}

test();
```

In Javascript: 
- Most of the time: We want to call functions on our values
    - Re-assigning is avoided

### In summary:

Most commonly used: `const`
Used when we need to re-assign: `let`
Avoid: `var`


# Lesson 4: Arrays

The quintessential data structure that can be used in a wide array of different situations

## Key Terms

### Array
A data structure for storing lists of information

JavaScript arrays:
- mutable
- can contain different data types
    - not recommended, but you can do it
- has special syntax for creating and updating them

``` js
const arr = [1,2,3];
console.log(arr[1]); // 2
```

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array

## Notes from the video

Fill method:

``` js
const arr = new Array(5);
arr.fill(0);
console.log(arr); // [0,0,0,0,0]
```

Edit items in an array:

``` js
const arr = [1,2,3];
console.log(arr[2]); // 3
console.log(arr.includes(3)); //true
```

indexOf / lastIndexOf:

``` js
const arr = [1,2,3,3];

console.log(arr.indexOf(3)); //2
console.log(arr.lastIndexOf(3));//3
```

Add/remove elements to/from the array:

``` js
const arr = [1,2,3];

arr.push(4,5,6);//append values to end o(1)

arr.pop(); //remove last o(1)

arr.unshift(69); //add at beginning (as if it was a queve) [o(n)]

console.log(arr); //[69,1,2,3,4,5]

arr.shift(); //remove from beginning

console.log(arr); //[1,2,3,4,5]
```

Arrays are objects
- Most data structures in JavaScript are!

``` js
const arr = [1,2,3];

console.log(typeof arr); //object
console.log(Array.isArray(arr)); //true
console.log(arr instanceof Array); //true (not used as often)
```

Deleting/Replacing items:

``` js
// .splice(): inplace changes array

// starting index: replacement from
// n: number of elements we want to delete
// optional: values to replace the deleted values w/
let arr = [1,2,3];
arr.splice(0, 2);
console.log(arr); //[3]

arr = [1,2,3];
arr.splice(1, 1);
console.log(arr); //[1, 3]

arr = [1,2,3];
arr.splice(0, 1, 'hello', 'world');
console.log(arr); //[ 'hello', 'world', 2, 3 ]
```

More arrays:


``` js
// .slice(): take a subset of an array

// starting index: inclusive
// ending index: exclusive

// n: number of elements we want to delete
// optional: values to replace the deleted values w/
const arr = [1,2,3];

const newArr = arr.slice(1, 3);
console.log(newArr); // [2, 3]
```

``` js
// add two arrays together
const arr = [1,2,3];
const newArr = arr.concat(['hello', 'world']);
console.log(newArr);
```


``` js
// reverse an array (inplace)
const arr = [1,2,3];
arr.reverse();
console.log(arr);
```


``` js
// .join(): combine all elements in an array into a string
// - param: delimiter (comma is default delimiter)
const arr = [1,2,3];

let str = arr.join(' - ');

console.log(arr);
console.log(str);
```

Loop through elements in the array:

``` js
const arr = [1,2,3];

// old way
for (let i=0; i < arr.length; i++) {
    console.log(arr[i]);
}

// for-of loop
for (const value of arr) {
    console.log(value);
}

// forEach
arr.forEach(function(value, index, array) {
    console.log(value, index, array);
});

// forEach WITH 'this' arg
arr.forEach(function(value, index, array) {
    console.log(value, index, this);
}, {num: 10}); // we don't use the 'this' argument very often...
```

Map function:
- What it does: Creates a new array based on the return values 

``` js
const arr = [1,2,3];

const mappedArray = arr.map(function(value, index) {
    return value + index //+ this.num;
}, {num: 10});

console.log(mappedArray);

const mappedArray2 = arr.map(function(value, index, array) {
    console.log(array);
    return value + index + this.num;
}, {num: 10});

console.log(mappedArray2);
```

Functions similar to array.map():

Filter: Creates a new array
- only adds elements that pass a condition


``` js
const arr = [1,2,3];

const filteredArray = arr.filter(function(value, index, array) {
    return value > this.num;
}, {num: 1});

console.log(arr); //1,2,3
console.log(filteredArray);//2,3
```

Find: Returns first value that matches a condition

``` js
const arr = [1,2,3];

const foundValue = arr.find(function(value, index, array) {
    return value > this.num;
}, {num: 1});

console.log(arr); //1,2,3
console.log(foundValue);//2
```

findIndex: returns the index of a value

``` js
const arr = [1,2,3];

const foundIndex = arr.findIndex(function(value, index, array) {
    return value > this.num;
}, {num: 1});

console.log(arr); //1,2,3
console.log(foundIndex);//1
```

Every: Does every element in the array fulfull these conditions?

``` js
const arr = [1,2,3];

const allPass = arr.every(function(value, index, array) {
    return value > this.num;
}, {num: 1});

console.log(arr); //1,2,3
console.log(allPass);//false
```

Some: If at least one...

``` js
const arr = [1,2,3];

const atLeastOnePasses = arr.some(function(value, index, array) {
    return value > this.num;
}, {num: 1});

console.log(arr); //1,2,3
console.log(atLeastOnePasses);//true
```

Note: I have been keeping them in, but you can remove the parameters from the function that you are not using...


.reduce()

Reduce: 

``` js
const arr = [1,2,3];

const sum = arr.reduce(function(accumulator, currValue) { // can add index and array, not 'this' though
    console.log('here');
    return accumulator + currValue;
})

console.log(arr);
console.log(sum);
```

``` js
// With default value of 0
const arr = [1,2,3];

const sum = arr.reduce(function(accumulator, currValue) {
    console.log('here');
    return accumulator + currValue;
}, 0)

console.log(arr);
console.log(sum);
```

.reduceRight()
- Works from right to left

``` js
const arr = [1,2,3];

const sum = arr.reduceRight(function(accumulator, currValue) { // can add index and array, not 'this' though
    console.log('here');
    return accumulator - currValue;
}, 0) // -6
// removing this will end at 0 because start at 3, then minus 2, minus 1 = 0

console.log(arr);
console.log(sum);
```

Sorting arrays:

``` js
const arr = [5,7,3,0];

arr.sort(); // does it inplace

console.log(arr); // [0,3,5,7]
```

``` js
const arr = [5,7,3,0];

arr.sort(compareNumbers);

function compareNumbers(firstNumber, secondNumber) {
    if (firstNumber == 3) {
        return -1;
    }
    if (secondNumber === 3) {
        return 1;
    }

    return secondNumber - firstNumber;
    
}

console.log(arr); // [3,7,5,0]
```

# Lesson 5: Objects

Why is JavaScript a mean programming language? It objectifies almost everything.

## Key Terms

### Object
The base non-primitive data structure of JavaScript used to store key-value pairs
- Usually: Keys are the strings
    - Symbols can also be used
- Values: Can be any time

Objects are usually declared with the object literal syntax, ie. 

``` js
const website = {
    name: 'AlgoExpert',
    domain: 'algoexpert.io',
};
```

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Data_structures#objects

### Symbol
A primitive value in JavaScript used for unique values
- Crearted using the `Symbol(description)` function, which returns a unique symbol
    - Even if two symbols have the same description, they will still be considered unique

- While symbols created with `Symbol(description)` are completely unique, symbols can also be created using `Symbol.for(key)`
    - This works the same way, except two calls to this function with the same key will return the same symbol (based on a global symbol registry)

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Symbol

Note: Primitive vs. Non-primitive
- Primitive: Immutable (can NOT be modified)
- Non-Primitive: Mutable (can be modified)

## Notes from the video

Objects: Most basic data structure

``` js
const myKey = 'key'

const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
    isAwesome: true,
    'multi word key': 0,
    //this is possible
    [myKey]: 1234
    
}

console.log(website);
console.log(website.name); //more popular
console.log(website['name']);//used if you have dash or spaces OR using a variable
```

How to change the object/website:

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
}
console.log(website.name); //AlgoExpert
website.name = 'FrontendExpert';
console.log(website.name); //FrontendExpert
delete website.name
console.log(website.name); //undefined
```

Note: Two objects are not equal to each other based on their values

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
}

console.log({} == {}); //false

const obj = {};
console.log(obj===obj); //true
```

Some nifty short-hand notation:

``` js
const name = 'Myles';
const obj = {
    name,
};

console.log(obj); //{ name: 'Myles' }
```

Another way to make an object:

``` js
const obj = new Object();
console.log(obj); //{}
obj.name = 'Myles';
console.log(obj); //{ name: 'Myles' }
```

### Functions constructors

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
}

// Functions constructor
function Website(name, rating, founders) {
    this.name = name;
    this.rating = rating;
    this.founders = founders;
}

const frontendExpert = new Website('FrontendExpert', 5, ['Myles'])

console.log(frontendExpert); //Website { name: 'FrontendExpert', rating: 5, founders: [ 'Myles' ] }
```

### Symbols


``` js

```

Properties of Symbols that are useful:
- Hidden from most iteration functions

Scenario: Add a value to an object that we got back from a 3rd party API
- Want to make sure that our property doesn't interfere with any of the 3rd party API's code
    - Example: object already has `id`, so we add id as `Symbol(id)`

``` js
const id = Symbol('id');
const id2 = Symbol('id2');


const obj = {
    [id]: 1234,
    [id2]: 0,
    id: 'hello',
    id: 'world',
};

console.log(obj); // { id: 'world', [Symbol(id)]: 1234, [Symbol(id2)]: 0 }
```

You still cannot have duplicate keys, so it will take the last object given.
Example: Above


Sometimes, you want the symbol to be the same
- You want the same symbol to exist on multiple different objects 

``` js
const id3 = Symbol.for('id3');
const id4 = Symbol.for('id3'); // global symbol registry

console.log(id3===id4); //true
```


### Checking if a key is in an object

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
}

// Method #1: in operator (Looks at properties on object AND objects it inherits from)
console.log('name' in website); //true

// Method #2 (RECOMMENDED): hasOwnProperty (Looks at properties on object)
console.log(website.hasOwnProperty('name')); //true

// Example of inheritance in action - notice how toString is nowhere coded on this ...
console.log('toString' in website); //true
console.log(website.hasOwnProperty('toString')); //false - it is not defined on website object


// Method #3: !== undefined (checking if it is not undefined)
console.log(website.name !== undefined); //true
website.name = undefined;
console.log(website.name !== undefined); //false
```

Add methods to the object we are creating:

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
    sayHello: () => console.log('hello!!')
};

website.sayHello();
```


``` js
// Better syntax (for writing methods)
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
    sayHello() {
        console.log('hello!!')
    },

    get getRating() {
        return this.rating;
    },

    set setRating(value) {
        this.rating = value;
    }

};

website.sayHello();

console.log(website.getRating); //notice how we use this as a standard property...

website.setRating = 6;
console.log(website.getRating);
```

### Make an object inherit from another object

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
};

const obj = {
    __proto__: website
};

console.log(obj); // {} (it has no own properties)

// Note: Objects look at the inherited object IF the object itself does not have it
console.log(obj.name); // AlgoExpert
console.log(obj.rating); // 5
```

Adding key-values to the object, and iterating over it:

Own keys and values:

1. Own keys: Object.keys(obj)
- returns array with the keys
    - excludes keys that are not its own ie. inherited properties/keys
    - excludes non-enumerable keys
        - string names: enumerable (stay)
        - Object: non-enumerable (does not stay)

2. Own values: Object.values(obj)

3. Own keys AND values: Object.entries(obj)
- Nested array of key-value pairs


``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
};

const obj = {
    foo: 'bar',
    [Symbol('id')]: 0,
    __proto__: website
};

console.log(Object.keys(obj));  // ['foo']
console.log(Object.values(obj)); //['bar']
console.log(Object.entries(obj));//['foo', 'bar']

Object.entries(obj).forEach(function([key, value]) {
    console.log(key, value);
}) // foo bar
```

How to keep inherited properties:

Method #2: for (key in obj)
- Keeps: 
    - Own
    - Proto (inherited)

- Removes:
    - non-enumerable
    - Symbols

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
};

const obj = {
    foo: 'bar',
    hello: 'hello',
    [Symbol('id')]: 0,
    __proto__: website
};

for (key in obj) {
    console.log(key);
} //foo
// hello
// name
// rating
// founders
```


### How to Copy and Object

Method #1: 
- Copies:
    - Enumerable OWN properties

- Does not copy:
    - Non-Enumerables
    - Inhertied/Proto

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
};

const obj = {
    foo: 'bar',
    hello: 'hello',
    [Symbol('id')]: 0,
    __proto__: website
};

const myObj = {
    original: 123,
};

console.log(myObj); // { original: 123 }

// 1st arg: Object to copy onto
// 2nd arg: Object we are taking values from 
Object.assign(myObj, obj); 

console.log(myObj); // { original: 123, foo: 'bar', hello: 'hello', [Symbol(id)]: 0 }
```

### More functions

Object.freeze(): Freezes an object
- "You can no longer change this obejct"
    - Makes it immutable (does this inplace)
    - Cannot add new properties
    - Cannot change properties

Note: You cannot un-freeze a frozen object

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
};

console.log(Object.isFrozen(website)); // false
console.log(website); // { name: 'AlgoExpert', rating: 5, founders: [ 'Clement', 'Antoine' ] }

Object.freeze(website);
website.name = 'FrontendExpert'; // cannot change existing
website.foo = 'bar'; // cannot add anything new

console.log(Object.isFrozen(website)); // returns true (it is frozen!)
console.log(website); // { name: 'AlgoExpert', rating: 5, founders: [ 'Clement', 'Antoine' ] }

// How to unfreeze
// You can't unfreeze!
```

Object.seal()
- Similar to freezing an object
    - Cannot add new properties
    - CAN change properties


``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
};

console.log(Object.isSealed(website)); // false
console.log(website); // { name: 'AlgoExpert', rating: 5, founders: [ 'Clement', 'Antoine' ] }

Object.seal(website);
website.name = 'FrontendExpert'; // CAN change existing
website.foo = 'bar'; // cannot add anything new

console.log(Object.isSealed(website)); // returns true (it is frozen!)
console.log(website); // { name: 'FrontendExpert', rating: 5, founders: [ 'Clement', 'Antoine' ] }
```

### Last functions

toString(): Turns an object into `[object Object]`
- Not useful: Does this by default

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
};

console.log(website.toString()); // [object Object]
```

Better way:
- Why it is useful: Anytime there is an internal functions that needs to convert the object into a function, it's going to call the .toString() function

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
};

console.log(website.toString()); // [object Object]

website.toString = function() {
    return 'Hello World';
};

console.log(website.toString()); // Hello World

website.toString = function() {
    return "Website Name: " + website.name;
};

console.log(website.toString()); // Website Name: AlgoExpert
```

.valueOf(): Prints out the actual objects
- Purpose: When object needs to be converted to a primitive
    - Usually no need to override it, although we will try that below

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],
};

console.log(website.valueOf()); // { name: 'AlgoExpert', rating: 5, founders: [ 'Clement', 'Antoine' ] }

website.valueOf = function() {
    return website.rating;
}

console.log(website.valueOf()); // 5
```

.toPrimitive(): 
- Uses a symbol
    - Function that takes in a hint
        - number
        - string
        - ambiguous (idk)

- This function takes precedence over toString() or valueOf (it overrules them)
- Can be complicated to edit

``` js
const website = {
    name: 'AlgoExpert',
    rating: 5,
    founders: [
        'Clement',
        'Antoine',
    ],

    [Symbol.toPrimitive](hint) {
        if (hint === 'number') {
            return website.rating;
        }
        else if (hint === 'string') {
            return website.name
        }
        else {
            return 'default';
        }
    }
};

website.toString = function() { // this is over-ruled / ignored
    return 'Hello World';
}
website.valueOf = function() { // this is over-ruled / ignored
    return 999;
}

console.log(String(website)); // AlgoExpert
console.log(Number(website)); // 5

// 
console.log("\nThese act differently, surprisingly...")
console.log(10 - website); // 5 (- is subtraction)
console.log(10 + website); // 10default (+ can be division OR concat - here it concat)
```


## Lesson 6: Equality And Type Coercion

== == ===
However...
== !== ===

## Key Terms

### Loose Equality
The most basic equality operator in JavaScript using `==`.
- Loose equality compares values regardless of types 

Steps:
1. If both values are either `null` or `undefined`, return true

2. Convert all `booleans` to `numbers`. `true` converts to 1, `false` converts to 0

3. If comparing a `number` to a `string`, convert the `string` to a `number`

4. If comparing a `object` to a `string`, convert the `object` using its `toString()` OR `valueOf()` methods.

5. If the types are the same, follow the same rules as *strict equality*

In general: Strict equality should be preferred
- It is easier to predict

Loose equality
- Can be useful for checking against `null` and `undefined` at once with `value == null`

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Equality

### Strict Equality
A JavaScript equality operator using `===`
- Compares both values AND types

Steps:
1. If either value is `NaN`, return false.

2. If the values have different types, return false.

3. If both values are `null` or both values are `undefined`, return true.

4. If both values are `objects`, return true IF they are the same object. Otherwise, false.

5. If both values are of the same primitive type, return true if the values are the same. Otherwise, false.

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Strict_equality

## Notes from the video

### Loose vs. Strict Equality

Equality / Type Coercion
1. Loose equality
2. Strict equality

``` js
// (loose equality)
console.log(5 == 5);  // true 
console.log(5 == '5');  // true

// (strict equality)
console.log(5 === 5); // true 
console.log(5 === '5'); // false 
```

### Type Coercion

Implicit Type Coercion: When JavaScript changes the type of 1 or both of the values in the comparison
- Usually: It tries to convert values to number

Explicit Type Coercion: When we change the types ourselves

``` js
console.log(Number(true)); // 1
console.log(Number(false)); // 0

console.log(Boolean(10)); // true
console.log(Boolean(0)); // false

console.log(typeof String(0)); // string
console.log(typeof 0); // number
```

### NaN

NaN: Result when you do math and you cannot do it
- NaN = "Not a number"
- It is not equal to anything!
    - Remember: Any comparison with a coercision to NaN will be false

``` js
console.log(Number('abcdefg')); // NaN
console.log(NaN == NaN); // false, even with loose equality
console.log(Number('abcdefg') == NaN); // false, even with loose equality
```

### Checking for null and undefined

Use loose equality for null and undefined:
- The only values that null/undefined are each to are each other!
    - x == null checks for null and undefined at the same time

``` js
const x = 5;

console.log(null==null); // true
console.log(null===null); // true
console.log(undefined==undefined); // true
console.log(undefined===undefined); // true

console.log(null==undefined); // true
console.log(null===undefined); // false



if ((x === null) || (x === undefined)) { // if x is null or undefined...
    console.log("x is null or undefined");
}
else {
    console.log("x is NOT null or undefined");
}

// This below checks the same thing
// Why: The only values that null/undefined are each to are each other!
// - it checks for null and undefined at the same time
if (x == null) { // if x is null or undefined...
    console.log("x is null or undefined");
}
else {
    console.log("x is NOT null or undefined");
}
```

### Object Equality

Comparing objects:
- We are checking if they are the same object, NOT if the contents are the same

``` js
console.log({} == {});  // false
console.log({} === {}); // false

const obj = {};
console.log(obj == obj); // true
console.log(obj === obj); // true

const arr = [];
console.log(arr == arr); // true
console.log(arr === arr); // true

const arr2 = [];
console.log(arr == arr2); // false
```

### Which one should we be using?

95-99% of the time: Use strict equality
- Not many times we want to assume that objects have same type

1-5% of the time: `x == null`
- You can also just do the `if ((x === null) || (x === undefined))` method


# Lesson 7: Syntactic Sugar and Modern JavaScript

Not as sweet as table sugar, but delightful nonetheless.

## Key Terms

### Arrow Function
A more concise function syntax
- Particularly useful: For replacing short anonymous functions

Basic syntax: 

``` js
(param1, param2) => {
    doSomething(param1, param2);
    return 'hello world';
}
```

However: If an arrow functions only requires one line, then the curly braces and return keyword can be removed
- Additionally: when these are used inline ie. for a call to the array map function, the semicolon must be removed
- Finally: If there is only 1 parameter, the parentheses around the parameter can also be removed

For example: This code will create an array with the values doubled:

``` js
[1,2,3,4].map(num => num * 2);
```

Constraints: There are a few constraints to arrow functions (we will explore them in this crash course)
- Most important constraint: They do not have `this` binding
- Additionally: Cannot be used as constructors or generators

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/Arrow_functions

### Desctructing Assignment
A JavaScript syntax for saving values from an array or object in variables. Example: 

``` js
const [first, second] = [1,2,3];
console.log(first); // 1
console.log(second); // 2

const { name } = { name: 'Conner' };
console.log(name); // 'Conner'
```

When destructuring an object, fields can also be renamed. Example: 

``` js
const { name: firstName } = { name: 'Conner' };
console.log(firstName); // 'Conner'
```

Destructuring can also be used in a function parameter, for example: 

``` js
function printName({name}) {
    console.log(name);
}
```

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Destructuring_assignment

### Rest Operator
A JavaScript operator using `...` for condensing multiple elements into a single array
- Uses the same syntax as the *spread operator*, but functionally is essentially the opposite

Rest syntax: Can be used in both arrays and objects to get all of the values not be destructed. Example: 

``` js
const arr = [1,2,3,4];
const [first, second, ...rest] = arr; // rest is [3, 4]

const obj = {key1: 1, key2: 2, key3: 3, key4: 4};
const { key1, key2, ...rest } = obj; // rest is {  key3: 3, key4: 4 }
```

Moreover, rest syntax can be used for function parameters to accept an infinite number of arguments, which are accessible as an array. For example: 

``` js
function myFunc(...myArguments) {
    console.log(myArguments);
}

myFunc(1,2,3,4); // logs [1,2,3,4]
```

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Functions/rest_parameters

### Spread Operator
A JavaScript operator using `...` for expanding iterables into individual elements
- Example: `myFunction(...myArray)` would pass each value in myArray as individual arguments to myFunction.

The spread syntax can also be used to combine 2 arrays.
- For example: `[...arr1, ...arr2]` would make a single array with all of the values of both arrays

Similarly: objects can be spread as well 
- Example: `{key: 'value', ...otherObj}` would add all of the fields from the other object into this object.

Moreoever, `{...obj}` can be used as a shallow clone of an object, since it creates a new object with the same fields.

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Spread_syntax

### Template Literal
Strings created using backticks `` that allow for inlining expressions, rather than needed concatenation.
- Inlined expressions use the syntax `${}`
- For example: ``Hello ${name}`` would have the same output as ` `Hello` + name`

Template literals also allow for *tagging* to write a function the defines custom behavior for the template literals.
- Tagging can be read about further in the MDN documentation, but doesn't really get used very often.

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Template_literals

### Null Coalescing
Also referred to as *nullish coalescing*, an operator using `??` for providing a default value if a value is null.
- if the value on the left side of the operator is not null or undefined, that value is used
- otherwise: the value on the right side of the operator is used

Example: 

``` js
const num = null ?? 1234; // 1234
const num2 = undefined ?? 1234; // 1234
const num3 = 5678 ?? 1234; // 5678
const num4 = '' ?? 1234; // ''
```

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Nullish_coalescing

### Optional Chaining
A JavaScript operator using `?.` for reading object properties without throwing an error if the object is null

Example: 
- `person?.company?.website` Will act the same as `person.company.website`, however if any values in the chain are null or undefined, it will return undefined (rather than throwing an error)

Learn more: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Optional_chaining

### Short Circuit Evaluation
A method of utilizing the evaluation order of JavaScript to conditionally run code.
- Usually: uses the `&&` operator
    - Because for it to return true, both the left and right side expressions must be true

- Since the browser runs code from left to right, if it encounters false on the left side, it does not even run the code on the right side (This can be used to conditionally run code)

Example:

``` js
true && myFunc(); // calls myFunc()
false && myFunc(); // does NOT call myFunc()
```

Less commonly: Short circuit evaluation can also be used with the `||` operator
- This operator only needs 1 expression to be true, so if the left side is true, the right side will not be evaluated
    - Essentially, the opposite of the behavior with `&&`

Example: 

``` js
true || myFunc(); // does NOT call myFunc()
false || myFunc(); // calls myFunc()
```

## Notes from the video

Making our code more concise and easier to read!

First example: 


### Anonymous and Arrow Method

- Arrow method is new

``` js
const arr = [1,2,3,4];

const doubled = arr.map(double);

function double(num) {
    return num * 2;
}

console.log(doubled); // [ 2, 4, 6, 8 ]

// Method #2: This should be the same... good for single callback
const doubled2 = arr.map(function(num) { // gets rid of function name!
    return num * 2;
});

console.log(doubled2); // [ 2, 4, 6, 8 ]

// Method #3: New way: Arrow function!
const doubled3 = arr.map((num) => {
    return num * 2;
});

console.log(doubled3); // [ 2, 4, 6, 8 ]
```

This doesn't even look that much cleaner... why is this better?

We can inline all of this in 1 line!
- get rid of return statemnt
- get rid of curly braces {}
- get rid of semicolon

``` js
const arr = [1,2,3,4];
const doubled = arr.map((num) => num * 2);
console.log(doubled); // [ 2, 4, 6, 8 ]
```

Note: This only works with a single line and single expression

One more thing: If there is only 1 parameter, you can get rid of even more!
- get rid of the parentheses around the parameters

``` js
const arr = [1,2,3,4];
const doubled = arr.map(num => num * 2);
console.log(doubled); // [ 2, 4, 6, 8 ]
```

This is very concise and easy to read!

### Destructuring Assignment AND ...rest Syntax

``` js
const arr = [1,2,3,4];

// These both do the exact same thing
const first = arr[0];
const second = arr[1];
// console.log(first, second); // 1 2

const [first, second, ...rest] = arr;
console.log(first, second); // 1 2
console.log(rest); // [ 3 , 4]
console.log(arr); // [ 1, 2, 3, 4 ]
```

### Destructuring Objects

We can do the above with objects, too!

``` js
const arr = [1,2,3,4];

const person = {
    name: "Myles",
    website: "FrontendExpert",
};

const { name: firstName, ...rest } = person;
console.log(firstName); // Myles
console.log(rest); //  { website: 'FrontendExpert' }
```

Note: We can also give default values in the case that a value does not exist:

``` js
const arr = [1,2,3,4];

const person = {
    name: "Myles",
    website: "FrontendExpert",
    company: "Foo",
};

const { name: firstName, company='AlgoExpert', ...rest } = person;
console.log(firstName); // Myles
console.log(company); // Foo (we don't use the defined default value...)
console.log(rest); //  { website: 'FrontendExpert' }
```

Desctructure when passing an object as a parameter to a function:

``` js
const arr = [1,2,3,4];

const person = {
    name: "Myles",
    website: "FrontendExpert",
};

// Old way
function printName(person) {
    console.log(person.name);
}

printName(person); // Myles

// New way
function printName2({name}) {
    console.log(name);
}

printName2(person); // Myles
```


### ...spread Syntax

Spread operator: Similar to ...rest operator
- Take an array, separate out the values as separate entities

``` js
const arr = [1,2,3,4];

function add(x, y) {
    console.log(x + y);
}

add(arr[0], arr[1]); // 3
add(...arr); // 3

const arr2 = [1];
add(...arr2); // NaN
```

Using spread operator in definition of another array:

``` js
const arr = [1,2,3,4];
const arr2 = [5,6,7,8];

const combined = [...arr, 69,  ...arr2];
console.log(combined);
```

Using spread to take infinite arguments in a function:

``` js
const arr = [1,2,3,4];

function logParams(x, ...rest) {
    console.log(x); // 1
    console.log(rest); // [ 2,3,4 ]
}

logParams(1,2,3,4);
```

### Template Literals

Template Literals: Same thing as an f-string

``` js
const name = "Myles";
const age = 25;

console.log(`Hello ${name}, you are ${age}`) // Hello Myles, you are 25
```


### Nullish Coalescing

Nullish Coalescing: Similar to a 1-line if-else statement

``` js
const name = "Myles";

// Old way
// if name is null: Default Name
// if name is NOT null: name
const defaultName = name != null ? name : 'Default name';
console.log(`Hello, ${defaultName} !!!`)

// Null coalescing operator (this is cleaner)
const defaultName2 = name ?? 'Default name';
console.log(`Hello, ${defaultName2} !!!`)
```


### Optional Chaining

Without chaining:

``` js
const person = {
    company: {
        website: 'AlgoExpert.io',
    }
}
console.log(person.company.website); // AlgoExpert.io

const person2 = {
    // company: {
    //     website: 'AlgoExpert.io',
    // }
}
console.log(person2.company.website); // error message !!!
```

With chaining!
- Returns undefined in the case that something that your are calling does not exist

``` js
const person2 = {}
console.log(person2?.company?.website); // undefined
```

### Bonus: Combining Nullish Coalescing w/ Optional Chaining

Super helpful for objects coming from an API/codebase that could be nuls

``` js
const person = {
    company: {
        website: 'AlgoExpert.io'
    }
}
console.log(person?.company?.website ?? 'Backup'); // AlgoExpert.io

const person2 = {}
console.log(person2?.company?.website ?? 'Backup'); // Backup
```

### Short Circuit Evaluation

Notes
- More concise than an if-else statements
- Not good practice (hacky)

``` js
const shouldRunCode = true;

function logWorld() {
    console.log('Hello World');
}

shouldRunCode && logWorld(); // Hello World (same as doing if else)
```

# Lesson 8: Connecting JavaScript to HTML

A little more nuanced than simply throwing a `<script>` tag into your HTML...

## Key Term
`<script>`
The HTML tag for adding JavaScript to the document.
- Usually: the `<script>` appears in the `<head>` with no children
    - Instead of children, it usually has the *src* attribute set to the path of the JS file

- By default: Scripts block the browser from continuing to parse/render the rest of the DOM until the script has finished downloading and executing
    - There are 2 boolean attributes that can change this behavior:

        - defer: Fetch the script asynchronously without blocking the page
            - Only execute the script after the DOM has finished being parsed

        - async: Fetch the script asynchronously witout blocking the page
            - Whenever the script is ready, stop parsing the DOM and execute the script
                - This is usually only for scripts that do not need access to the DOM (otherwise, the behavior would be inconsistent based on how quickly the script downloaded)

Alternatively: Scripts were traditionally placed at the bottom of the `<body>` to ensure the DOM finished loading before running the script
- However: This is slower than using the *defer* method/attribute, since the script will not be downloaded until reaching the script tag at the end of the body.

Learn more: https://developer.mozilla.org/en-US/docs/Web/HTML/Element/script

## Notes from the video

Start by doing the following:
- Copy the connectingJS.html file

    ``` html
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <title>Connecting JS to HTML</title>
        </head>
        <body>
            <button>Click Me</button>
        </body>
    </html>
    ```

- Run it in Chrome
    - cd FrontendExpert/javascript_crash_course/8_connecting_javascript_to_html
    - start connectingJS.html

- Copy the server.js code

    ``` js
    const button = document.querySelector('button'); // get button element off the page
    button.addEventListener('click', setBackgroundColor); // when button is clicked, run this function

    function setBackgroundColor() {
        document.body.style.backgroundColor = '#00334C';
    }
    ```

Let's start connecting the two:

- Add functionality 

    ``` html
    <!-- Line 5, under <title> -->
    <script src="script.js"></script>
    ```

Note:
- We are adding it to the head because it doesn't need to be displayed on the page (it is not content)
- script tag is NOT a self closing tag
    - this is because you can write JS code directly inside of it
        - Usually: You link in a JS file

When I click on the button, it still does not work. Why?
- If you look at this code, the browser goes from top to bottom
- We are referencing the button (line 5) before it even exists in the DOM/html file! (line 8) 

### Solution #1: Move the script tag to the bottom

Classic method - Bad idea for the following reasons:
- Semantics (weird having a script in the body)
- Takes extra time (you have to download all of the html before getting into the script)

### Solution #2: Solve in Javascript

Top of JS file:
- We are not running any of the code until this even fires

``` js
window.addEventListener('DOMContentLoaded', main); // Run main once all of the content is loaded

function main() {
    const button = document.querySelector('button'); // get button element off the page
    button.addEventListener('click', setBackgroundColor); // when button is clicked, run this function

    function setBackgroundColor() {
        document.body.style.backgroundColor = '#00334C';
    }
}
```

This method works!

You can also change '' with 'load;:
- 'DOMContentLoaded': just waits for browser to finish creating DOM tree
- 'load': waits for images etc. to be loaded as well

Negatives:
- Have to make JS code uglier (more code too)

### Solution #3: defer (BEST solution)

Defer: Essentially does what we just did, but the HTML does it for us!
- "Download this script and parse it, but don't actually run any of this code until the DOM content loaded event has completed"

``` html
<script src="script.js" defer></script>
```

Pros:
- Cleaner JS
- Cleaner HTML
- JS is not executed until DOM is done loading 


### Solution #4: async

async: Similar to defer
- "Load the script asynchronously. when it is ready, just execute it"

Negatives
- Can lead to inconsistent behavior (depending on how fast the browser finishes in the DOM/script)


### Takeaway from video

Use the `defer` attribute!

``` html
<script src="script.js" defer></script>
```

- start connectingJS.html


# Lesson 9: DOM Manipulation

An acceptable form of manipulation.

## Key Term

### Dom Manipulation
Using JavaScript to change the content, structure, or styles of the page

There are lots of functions/properties related to dom manipulation, but here are the most common ones: 

Getting elements:

- document.getElementById(id): Gets a single element based on its `id` attribute.

- document.querySelector(cssSelector): Gets a single element based on a CSS selector.
    - If multiple elements match the selector, return the first one

- document.querySelectorAll(cssSelector): Gets all elements matching a CSS selector as a NodeList

- document.getElementsByTagName(tagName): Gets all elements with a specific HTML tag as an HTMLCollection

- document.getElementsByClassName(className): Gets all elements with a specific class as an HTMLCollection

Settings Attributes:

- element.style.property: Sets a CSS property using inline styles
    - Although, CSS classes should usually be preferred
    - The style object will only contain inline styles (not those set with CSS)

- element.setAttribute('attribute', 'value'): Sets an HTML attribute to a specific value

- element.textContent: The text content of an element, including that of any children.
    - Note: this is slightly different from the following:
        - element.innerText, which only gets text that is actually rendered
        - element.innerHTML, which only gets the entire HTML code as a string
        
- element.attribute: An alternative to setAttribute function
    - Attributes can be directly edited via their property name
    - Example: `element.value` would get the value attribute from element

- element.classList: An object for updating CSS classes
    - Specifically: this contains 3 primary functions
        - add(className)
        - remove(className)
        - toggle(className)

Adding And Removing Elements: 

- document.createElement(tagName): Creates a new HTML element

- document.createTextNode(text): Creates a text node as an alternative to setting textContext

- document.createDocumentFragment(): Creates a document fragment, which is useful for appending multiple elements at once after a loop

- element.appendChild(element): Appends an element to the end of the contents of another element

- element.append(node1, node2, ...): Appends 1 or more nodes (elements OR text) to the end of the contents of another element

- element.prepend(node1, node2, ...): Prepends 1 or more nodes (elements OR text) to the beginning of the contents of another element

- element.remove(): Removes the element from the DOM

Sizes and scrolling:

- window.innerWidth: The width of the browser window

- window.innerHeight: The height of the browser window

- window.getComputedStyle(element): Gets styles as they are currently rendered on the page
    - converted to pixels

- element.clientHeight: The height of visible content and padding

- element.offsetHeight: The height of visible content, padding, borders, and scrollbars

- element.scrollHeight: The height of all content and padding, including content scrolled out of the view

- element.offsetTop: The distance from the outer top border of the element to the inner top border of the nearest positioned parent

- element.scrollIntoView(): Scrolls the container so the element is in view

- element.scrollTo(optionsObj): Scrolls the element to a specified *top* value in the options object
    - Additionally: `behavior: 'smooth'` will create a smooth transition


## Notes from the video

Interacting with the dome using markup!

### DOM Manipulation Overview

What our JS/HTML/CSS current have:
- A basic page
    - 3 list items
    - scrollable div

Couple notes:

``` css
#scrollable {
    overflow: auto;
    /* If the content is larger than the height, make it have a scroll bar  */
}
```

Let's move over to the JS file and start manipulation the DOM with JavaScript!

### Steps to view JS/HTML/CSS in Google Chrome:

Method #1: 
- Command Line: start FrontendExpert/javascript_crash_course/9_dom_manipulation/domManipulation.html

- Right click > Inspect > Console
    - When you write JavaScript code, save your .js file and refresh the browser to see it

        ![example of js code in browser](../javascript_crash_course/9_dom_manipulation/figures/0.png)


Method #2: 
- Change into directory: cd FrontendExpert/javascript_crash_course/9_dom_manipulation
- Check for version of node.js: node -v
- Install the command-line http server: npm install http-server -g
- Run the command-line http server: http-server
- http://127.0.0.1:8080 > Ctrl-C > Click on HTML File
- Right click > Inspect > Console


Note: If you get this error: "cannot be loaded because running scripts is disabled on 
this system.", do the following:
- Powershell > Run as Admin > Yes
- View current execution policy: Get-ExecutionPolicy
    - Mine says 'Restricted'
- Change the execution policy: Set-ExecutionPolicy RemoteSigned > y
    - RemoteSigned meaning: This policy enables you to run locally-created scripts, while scripts downloaded from the internet must be signed by a trusted publisher to execute.
- Verify the new policy: Get-ExecutionPolicy
- Close and reopen the PowerShell window to apply the changes.

Note: If you get this error "Devtools failed to load source map: Could not load content for ...", do the following:
- Google Chrome > Right click > Inspect > Settings > Sources 
- Uncheck the following:
    - "Enable JavaScript source maps"
    - "Enable CSS source maps"

### Selecting Elements

document object `document`: Contains most of the functions for interacting with the DOM

``` js
// Ways of grabbing 1 elements
const secondLi = document.getElementById('second-li'); // takes in html property named second-li
const firstLi = document.querySelector('li'); // takes in first CSS selector named li
console.log(firstLi);
console.log(secondLi);

// Get all queries for a selector
const listItems = document.querySelectorAll('li'); // comes in an iterable NodeList
console.log(listItems); 

console.log(listItems.length); // 3

// Iterate over NodeList
// 1
listItems.forEach(li => {
    console.log(li); // []
})
// 2
Array.from(listItems).map(li => {
    console.log(li); // []
})

// More ways to get multiple elements
// Note: do NOT recommend getting these way
// NodeList > HTMLCollection
// - Example: HTMLCollection does not have .forEach()
console.log(document.getElementsByClassName('list-item')); // add class="list-item" to an HTML item to get this
console.log(document.getElementsByTagName('li')); // HTMLCollection with 3 list items
```


### Editing DOM Nodes

``` js
const listItems = document.querySelectorAll('li'); // 

console.log(listItems.style); // undefined 

// listItems[0].style.color = 'red'; // change text color
// listItems[0].style.backgroundColor = 'blue'; // change background color
listItems[0].textContent = 'Changed!'; // change the text

// we don't use these as much:
listItems[0].value = 5; // change the value's order in the listItems (makes the #'s start at 5)
listItems[0].setAttribute('value', '7'); // same as above (pass in as string)
listItems[0].setAttribute('class', 'blue big'); // changes this to be of class='blue' and 'big'

// removes / add
listItems[0].classList.remove('big'); // changes 'blue big' into just 'blue'
listItems[0].classList.remove('blue'); // changes 'blue' into just ''
listItems[0].classList.add('big', 'blue'); // adds it right back

// toggle: If class is already there, remove it! if not, add it!
listItems[0].classList.toggle('big'); // removes big
listItems[0].classList.toggle('big'); // add big

// change className (used less often: best to use classList)
// listItems[0].className = 'blue big'; //
```

### Creating DOM Nodes


``` js
const listItems = document.querySelectorAll('li');

// Create DOM node
const p = document.createElement('p'); // nothing apppears on the page yet...
p.textContent = "Hello World";

// Add to the DOM
document.body.appendChild(p); // appendChild: takes in nodes
document.body.append('appended text'); // append: works with text OR nodes
document.body.prepend('prepended text'); // preppend: works with text OR nodes

const text = document.createTextNode('text Node'); 
p.append(text); // adds text node to the already existing p node

// Working with editable innerHTML (NOT recommended)
console.log(document.querySelector('ol').innerHTML); // 
document.body.innerHTML += '<p>HTML Test String</p>'; 
// document.body.innerHTML += '<script>doSomethingBad()</script>'; 

document.body.innerHTML = ''; // exception: clears out the entire element (useful for removing an entire container)
console.log(document.innerHTML); // 
```


#### Creating DOM Nodes in a loop

``` js
const listItems = document.querySelectorAll('li');
const p = document.createElement('p');
const text = document.createTextNode('text Node'); 
p.append(text); 

document.body.prepend(p);

for (let i = 0; i < 3; i++) {
    const parent = document.querySelector('ol');
    const li = document.createElement('li');
    li.textContent = `List item with i=${i}`;
    parent.append(li); 
}

// Issues with this loop:
// 1. We don't need to cal querySelector every loop
// 2. Looping with .append() means you need to render the page at every loop
// - Fix with a list OR
// - Fix with a fragment (your own little DOM - not on the page so does not cause renders!)
//     - Better option: Fragment
const parent2 = document.querySelector('ol');
//const listItemsToAdd = [];
const fragment = document.createDocumentFragment();
for (let i = 0; i < 3; i++) {
    const li2 = document.createElement('li');
    li2.textContent = `List item with i=${i}`;
    //listItemsToAdd.push(li2);
    fragment.append(li2); 
}
//parent.append(...listItemsToAdd); // 
parent.append(fragment); 
```

### Removing items from the DOM

``` js
const listItems = document.querySelectorAll('li');
const p = document.createElement('p');
const text = document.createTextNode('text Node'); 
p.append(text); 
document.body.prepend(p);

// const parent = document.querySelector('ol');
// const fragment = document.createDocumentFragment();
// for (let i = 0; i < 3; i++) {
//     const li = document.createElement('li');
//     li.textContent = `List item with i=${i}`;
//     fragment.append(li); 
// }
// parent.append(fragment);

// Removing items from the DOM
console.log(listItems[0].parentNode); // <ol> ... </ol>
// listItems[0].parentNode.removeChild(listItems[0]); old way
listItems[0].remove(); // new way
console.log(listItems[0].parentNode); // null ('List Item 1' is gone)
```

### DOM Sizes

``` js
const listItems = document.querySelectorAll('li');

console.log(window.innerWidth); //  width  = 339
console.log(window.innerHeight); // height =  842

console.log(listItems[0].style.fontSize); // empty string (font size is not set on element, so it is not on style)

// Get what the browser is currently displaying, instead!
let a = window.getComputedStyle(listItems[0]).fontSize;
console.log(a); // 16px (root element is set to this, so)

listItems[0].classList.add('big'); 
let b = window.getComputedStyle(listItems[0]).fontSize;
console.log(b); // 32px (16px * 2em = 32px)
```


#### Scrollable Container Sizes


``` js
const listItems = document.querySelectorAll('li');

const scrollable = document.getElementById('scrollable'); // grabs the scrollable element

// Remember: it is currently overflowing - take that into account when we get sizes!
console.log(scrollable.clientHeight); // 90: height of visible content of the pattern (90 = 70 + 10 borderpx on each side)
console.log(scrollable.offsetHeight); // 100: clientHeight + border (90 + 5px border each side)
console.log(scrollable.scrollHeight); // 342: total height of content (even content out of view) + padding

// offsetTop: distance from outer border to inner positioned parent border
console.log(scrollable.offsetTop); // Scrollable container to top of the page

console.log(scrollable.querySelectorAll('p')[0].offsetTop); // 26: 1st list item, to top of scrollable container (border + padding = 26)
console.log(scrollable.querySelectorAll('p')[5].offsetTop); // 196: 6th list item, to top of scrollable container
```


### Scrolling

Important: Sometimes we need to automatically scroll the content


``` js
const listItems = document.querySelectorAll('li');
const scrollable = document.getElementById('scrollable'); // grabs the scrollable element

// Move the scrolable down to a certain item (without touching mouse)
scrollable.querySelectorAll('p')[5].scrollIntoView();

// How to smoothly transition:
scrollable.scrollTo({
    top: scrollable.querySelectorAll('p')[2].offsetTop,
    behavior: 'smooth'
});
```

# Lesson 10: Event-Driven Programming

The old adage "better to be proactive than reactive" does not apply here!

## Key Terms

### Event-Driven Programming
A programming paradigm where code runs as a response to events
- Usually: initiated by the user

How to create an event listener: `element.addEventListener(eventName, callback, useCapture)`
- If the 3rd argument is `true`, the callback will fire during the capturing phase (instead of the default bubbling phase)

Additionally: `addEventListener` can be called with an options object as the 3rd parameter instead of the `useCapture` boolean. This object can contain the following possible values:

- capture: The same as the boolean argument option; `true` for capturing, `false` for bubbling

- once: if `true`, automatically removes the event listener after the event fires one time

- passive: if `true`, indicates to the browser that `event.preventDefault()` will not be called. 
    - Useful for the browser to optimize performance
        - (especially w/ mobile scrolling events such as `touchstart` and `touchmove` to indicate to the browser that scrolling will not be cancelled)

- signal: An `AbortSignal`, usually coming from an `AbortController`.
    - If the signal's `abort()` method is called, the event listener will be removed

To remove an event listener:
- `element.removeEventListener(eventName, callback, useCapture)`
OR 
- `element.removeEventListener(eventName, callback, optionsObj)`
    - Uses the same parameters as creating the event listener


### Event Propogation
The process by which an event travels through the DOM to call event listeners on nested elements.

Consists of 3 phases:
1. Capturing: The event travels down from the root of the document to the event target
2. Target: The event fires on the event target
3. Bubbling: The event travels up from the event target to the root of the document

At any point in the propogation process, an event listener can call `event.stopPropogation()`, which will stop the propogation process.


### Event Delegation
The process of using a single event listener on a parent element to manually delegate events to children (rather than using event listeners on each child)

Event delegation takes advantage of *event propogation*
- Example: After clicking on a button, that event will bubble up to the parent container

In the event a container has many children that all have similar event listeners, event delegation can make substantial performance improvements
- Lowers total number of active event listeners
- The `event.target` property can be used to determine which child was the source of the event


## Notes from the video

### addEventListener()

``` js
const button = document.querySelector('button'); // select the button with JS

// Event propogation: 
// 1. capturing: starts at root, traverse down DOM until target
// - no event listeners are actually called
// 2. target: fire the event on the actual element
// 3. bubbling: when we move back up
// - calls events on all elements we see
button.addEventListener('click', onClick); // When this button is clicked, run this command!
document.body.addEventListener('click', onClick); // 

function onClick(event) {
    // console.log(event);
    // console.log(event.type);
    console.log(event.target);
    console.log(this); // usually: same as event.target (not always, as in this case)
    // console.log('you clicked the button!');
}
```

Test it out:
- cd FrontendExpert/javascript_crash_course/10_event_driven_programming
- node -v
- npm install http-server -g
- http-server
- http://127.0.0.1:8080
- Right click > Inspect > Console

OR 
- start FrontendExpert/javascript_crash_course/10_event_driven_programming/eventDrivenProgramming.html


How to stop dealing with Propogation?

### stopPropogation()

"Stop going through any more phases"

``` js
const button = document.querySelector('button'); 
button.addEventListener('click', onClick);
// document.body.addEventListener('click', onClick); // doesn't get called!
document.body.addEventListener('click', onClick, true); // true: has it fire during capture phase (1st)


function onClick(event) {
    //event.stopPropagation();
    console.log(event.target);
    console.log(this); 
}
```

Note: Not all events propogate


### preventDefault()

Prevents our browser's default behavior from occurring
- Doesn't get used a ton

``` js
function onClick(event) {
    event.preventDefault(); // stops browser's behavior 
    console.log(event.target);
    console.log(this); 
}
```

### 3rd parameter: Options Object

4 different possibles values:

#### 1. capture
- true: fire during capture phase
- false: fire during bubbling phase

#### 2. once
- true: first 1x
- false: keeps firing

#### 3. passive
- true: we are not going to call event.preventDefault
    - this is good for specific events ie. touchscreen/touchmove
- false: 

#### 4. signal
- You can abort an event ie. remove the event listener


``` js
const button = document.querySelector('button');

button.addEventListener('click', onClick, {
    capture: true,
    once: true,
    passive: true,
    signal: AbortController.signal
});

// abortController.abort(); // removes the event listener

function onClick(event) {
    console.log(event.target);
    console.log(this); 
}
```

### removeEventListener()
Manually get rid of an event listener.

Nothing will happen in this script:

``` js
const button = document.querySelector('button');

button.addEventListener('click', onClick);

button.removeEventListener('click', onClick);

function onClick(event) {
    console.log(event.target);
    console.log(this); 
}
```

### Common Events

`dblclick`: You need to press the button twice to fire the event.
`mousedown`: You need to press the button down to fire the event.
`mouseup`: You need to press the button up to fire the event.


``` js
const button = document.querySelector('button');

// We usually just use click, but these are other options:

button.addEventListener('dblclick', onClick); // double 
button.addEventListener('mousedown', onClick); // when mouse goes down
button.addEventListener('mouseup', onClick); // when mouse goes up

function onClick(event) {
    console.log(event.target);
    console.log(this); 
}
```

### Keyboard keys down:
- There is also `keyup`

``` js
window.addEventListener('keydown', event => {
    console.log(event.code); // prints the key your press
});
```

### Scrollable

scrollTop: How far down we are scrolling

``` js
const scrollable = document.getElementById('scrollable');

scrollable.addEventListener('scroll', event => {
    console.log(event.target.scrollTop);
})
```

mouseenter: Logs out the x,y coordinates of where the mouse is
mousemove: Logs out the x,y when you move the mouse 
- Fires even more

``` js
const scrollable = document.getElementById('scrollable');

scrollable.addEventListener('mouseenter', event => { // mousemove
    console.log(event.pageX, event.pageY);
})
```

### Drag and Drop

First: Add the following to your HTML
- What this means: This element CAN be draggable
    - (only images default to draggable - need to set it manually)

``` html
<!--  -->
<button draggable="true">Click Me</button>
```

``` js
const scrollable = document.getElementById('scrollable');
const button = document.querySelector('button');

button.addEventListener('dragstart', event => {
    console.log(event);
});

// How to drop the element somewhere
scrollable.addEventListener('drop', event => {
    scrollable.prepend(button);
});

// Fires whenever you hover over
// - prevents default behavior so that we can now drop it inside of the scrollable
scrollable.addEventListener('dragover', event => {
    event.preventDefault();
});
```

### Event Delegation

Event Delegation: Sometimes we have some container that we need to run events on the contents of the container
- All contents may have the same event listener
- The more event listeners we add to the browser, the slower our page runs
    - Not a problem with 10, but it can if you scale up

Goal of Event Delegation: 
- Have event listener be on the parents
- Utilize propogation to have parents call functions based on target of event ie. which child was clicked on

Example (with a scrollable container):

``` js
const scrollable = document.getElementById('scrollable');
const button = document.querySelector('button');

scrollable.addEventListener('click', event => {
    // "If we click on something inside of the container"
    if (event.target !== this) {
        event.target.textContext = 'Clicked'; // if you click on a paragraph, the text changes!
    }
    else {
        event.target.textContext = 'You broke something';
    }
});

// Note: This callback should use a standard function to create a 'this' context
```

Why this is better:
- only 1 event listener
- less code