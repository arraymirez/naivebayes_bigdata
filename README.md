# naivebayes_bigdata

# Meaning
A naive Bayesian classifier is a probabilistic classifier based on Bayes' theorem and some simplifying hypotheses.

The naive or simple Bayesian classifier (NBC) is based on the assumption that all the attributes are independent given the class variable. 

The naive Bayes formulation drastically reduces the complexity of the Bayesian classifier, as in this case we only require the prior probability (one dimensional vector) of the class, and the n conditional probabilities of each attribute given the class (two dimensional matrices). The space requirement is reduced from exponential to linear in the number of attributes. 



# Bayes Theorem
In probability theory, it is a proposition raised by the English mathematician Thomas Bayes and published posthumously in 1763, which expresses the conditional probability of:

  *"A random event A given B in terms of the conditional probability distribution of event B given A and the marginal probability distribution of only A"*
  
 ![Bayes Theorem](https://miro.medium.com/max/1468/1*LB-G6WBuswEfpg20FMighA.png) 
 
# Example
Consider the case of two colleagues who work in the same office: 
Alicia and Bruno.

We know that:

**Alicia comes to the office 3 days a week.**

**Bruno comes to the office 1 day a week.**

We can calculate the probability of each as follow:

*P(Alicia) = 3/4 = 0.75*

*P(Bruno) = 1/4 = 0.25*

We are in the office and we see someone passing by in front of us very fast, so fast that we do not know if it is Alicia or Bruno.

Who did we see passing?

![Examples](https://miro.medium.com/max/970/1*dz1jJM2c1lSnUn8WGxjSmw.png)

When we saw the person go by, we saw that he or she was wearing a red jacket. We also know the following:

**Alicia wears red 2 times a week.**
**Bruno wears red 3 times a week.**

![Examples2](https://miro.medium.com/max/2000/1*2U7-HsCsnHAW5m5JhUDyCg.png) 



 # Bayesian Classifiers: Multinomial
The Naive Bayes Multinomial model considers the frequency of occurrence of each term in *Xt* documents instead of a binary occurrence.
This means that also it has to known how many times an event is happening to make a valid classification.

It is mainly used for document classification problems, that is, if a document belongs to the category of sports, politics, technology, etc.

The characteristics/predictors used by the classifier are the frequency of the words present in the document.



# Bayesian Classifiers: Bernoulli Distribution
It corresponds to a discrete probability distribution, used in dichotomous experiments, that is, with two possible outcomes, success or failure.

Considering:
*x: Success variable #
P: Probability of success
Q: Probability of Failure*

Probability Function:
*f (x) = P ^ x (1-P) ^ 1-x*

Bernoulli's distribution has 3 possible values:

*x = 1 f (x; P) = P*

*x = 0 f (x; Q) = Q*

*x = a (f; P) = 0*

# Advantages
-It is an easy and fast way to predict classes, for binary and multiclass classification problems.

-In cases where a presumption of independence is appropriate, the algorithm behaves better than other classification models, even with less training data.

-The decoupling of distributions of conditional class characteristics means that each distribution can be estimated independently as if it had only one dimension.

# Disadvantages
-Poor estimators. Therefore, the probabilities obtained must not be taken very seriously.

-The presumption of Naive independence most likely does not reflect how the data is in the real world.

-When the test data set has a characteristic that has not been observed in the training set, the model will assign a probability of zero and it will be useless to make predictions.

# Aplications
-Spam detector (email, sms)

-Recommendation System

-Classification of galaxies

# Summary
The Naive Bayes algorithm is mainly used in analysis, spam filtering, recommendation systems, etc.
They are fast and easy to implement, what the difference over other algorithms is their ability to handle an extremely large      number of features, working well even with the presence of irrelevant features and not affected by them, rarely over-adjusts the data.


# Code

A Scala example code can be found in our [Big Data Repo] (https://github.com/arraymirez/naivebayes_bigdata/blob/Naive_Bayes-Doc/naivebayes.scala).

