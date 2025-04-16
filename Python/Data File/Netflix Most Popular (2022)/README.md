# Netflix Popular Data (2022)

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

### **Language:**  
- **Python**  

### **Libraries:**  
- **Pandas** – Data manipulation and analysis.  
- **NumPy** – Numerical computing and array operations.  
- **Matplotlib** – Data visualization through plots and charts.  
- **Seaborn** – Advanced statistical data visualization.  
- **Scikit-learn** – Machine learning models, preprocessing, and evaluation.  

---

## Data Cleaning  

### **Steps:**  
1. **Handling Missing Values** – Removed NaN values using `dropna()` to ensure dataset completeness.  
2. **Eliminating Duplicates** – Used `drop_duplicates()` to maintain data integrity.  
3. **Type Conversion** – Converted columns like `year`, `duration`, and `votes` into proper numerical formats.  
4. **Feature Selection** – Kept relevant columns (`title`, `rating`, `description`, `votes`) for focused analysis.  
5. **Sorting Data** – Organized the DataFrame by rating (`sort_values(by='rating', ascending=False)`) to highlight top-rated titles.  

---

