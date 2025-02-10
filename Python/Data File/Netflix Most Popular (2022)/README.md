# Netflix Popular Data (2022) - Basic Analysis

## Overview
This project involves analyzing a dataset of popular Netflix movies and series. The goal is to extract meaningful insights and visualize trends in ratings, genres, and audience engagement.

## Table of Contents
- [Introduction](#introduction)  
- [Dataset](#dataset)  
- [Languages & Libraries](#languages--libraries)  
- [Data Cleaning](#data-cleaning)  

## Introduction
In this project, we analyze a dataset of Netflix's popular movies and series from 2022. We aim to understand trends in ratings, identify top genres, and assess audience engagement based on the number of votes.

## Dataset
The dataset used in this project was collected from Kaggle. It includes information on movie/series titles, ratings, genres, and number of votes.

### Data Dictionary
- **Title**: Title of the movie or series.  
- **Year**: Year of release or airing period.  
- **Certificate**: Content rating.  
- **Duration**: Duration of the movie or episode.  
- **Genre**: Genre(s) of the movie or series.  
- **Rating**: Average rating.  
- **Description**: Summary or synopsis of the content.  
- **Stars**: List of lead actors.  
- **Votes**: Number of votes received.  

## Languages & Libraries
### Language:
- **Python**  

### Libraries:
- **Pandas** - Software library for data manipulation and analysis.  
- **NumPy** - Software library for numerical computing in Python.  
- **Matplotlib** - Software library for creating graphical visualizations in Python.  

## Data Cleaning
Data cleaning was performed by removing missing values, eliminating duplicates, selecting relevant columns, and sorting the DataFrame by rating in descending order.

### Steps:
- Removed missing values to ensure complete data for analysis.  
- Eliminated duplicate entries to maintain data integrity.  
- Selected relevant columns (**title, rating, description, votes**) for focused analysis.  
- Sorted the DataFrame by the **rating** column in descending order to highlight top-rated titles.

### Continued...
