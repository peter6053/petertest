#Yoyo Android Dev take home test

An app to fetch Photos from the nasa api





## API Reference

#### Get all items

```http
  GET https://images-api.nasa.gov/
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `date` | `string` | **Required**. start and end date |

#### endpoint

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| n/a     | `string` | **Required**."search?q=milky%20way&media_type=image&year_start=2017&year_end=2019" |

#### add(num1, num2)

Requirements
● When opening the app, users should see a list of results including image, title, center
and date;
● When selecting one of the results, users should be presented with a details screen
containing image, title, description, center and date;
● Loading and error states should be handled properly;
● Include a README file explaining the main decisions taken or any information you
find relevant (e.g. 3rd party libraries used, architecture, things to improve, known
bugs, etc).

## Screenshots

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)


## Libraries used



Glide - for displaying photos

Retrofit And Gson - for making api calls

 MVVM Architectural Design Pattern

 Navigation - Navigate through the app

  junit -Unit tests and ui testing

  Data binding
  

## Feedback, bugs and what can be done beter

The test is quite challenging,

I have used pagination for imaging, but it needs improvement and use the paging source library to load images faster

I will add a search filter to the app, instead of scrolling the user can search

Key decision taken is to use mvvm, reason it easier to test and scale,Also add new features in the app with making alot of iterations

Also in the project, i realised i could use corutines in order to observe the lifecycle of event, this is on eof the thing that can be improved

