class Song(val lyrics: String)

trait Censor {
  val alternativeWords = Map(
    "motherfucking" -> "mother loving",
    "motherfucker" -> "mother lover",
    "fucking" -> "freaking",
    "fucker" -> "fornicator",
    "fuck" -> "fornicate",
    "Fuck" -> "Fornicate",
    "asses" -> "butts"
  )

  def cleanVersion() {
    var result = lyrics
    val replacements = alternativeWords.toSeq.sortBy(tuple => tuple._1.length).reverse
    replacements.foreach (tuple => result = ((tuple._1).r).replaceAllIn(result, tuple._2))
    println(result)
  }
}

class RudeSong(override val lyrics: String) extends Song(lyrics) with Censor {
}

val lyrics = """
Fuck the motherfucker, fuck the motherfucker,
Fuck the motherfucker he's a fucking motherfucker.
Fuck the motherfucker, fuck the fucking fucker,
Fuck the motherfucker he's a total fucking fucker
Fuck the motherfucker, fuck the motherfucker,
Fuck the motherfucker, fuck him, fuck the motherfucker.
Fuck the motherfucker, fuck the motherfucking pope.

Fuck the motherfucker, and fuck you motherfucker
If you think that motherfucker is sacred.
If you cover for another motherfucker whos a kiddy-fucker,
Fuck you, you're no better than the motherfucking rapist.
And if you don't like the swearing that this motherfucker forced from me
And reckon it shows moral or intellectual paucity
Then fuck you motherfucker, this is language one employs
When one is fucking cross about fuckers fucking boys

I dont give a fuck if calling the pope a motherfucker
Means you unthinkingly brand me an unthinking apostate.
This has nowt to do with other fucking godly motherfuckers
I'm not interested right now in fucking scriptural debate.
There are other fucking songs and there are other fucking ways,
I'll be a religious apologist on other fucking days,
But the fact remains if you protect a SINGLE kiddy fucker
Then Pope or Prince or Plumber, youre a fucking motherfucker.

See I don't give a fuck what any other motherfucker
Believes about Jesus and his motherfucking mother.
I've no problem with the spiritual beliefs of all these fuckers
While those beliefs don't impact on the happiness of others,
But if you build your church on claims of fucking moral authority
And with threats of hell impose it on others in society,
Then you, you motherfuckers, can expect some fucking wrath
When it turns out you've been fucking us in our motherfucking asses.

So fuck the motherfucker, and fuck you motherfucker
If you're still a motherfucking papist.
If he covered for a single motherfucker whos a kiddy-fucker,
Fuck the motherfucker, he's as evil as the rapist.
And if you look into your motherfucking heart and tell me true
If this motherfucking stupid fucking song offended you,
With its filthy fucking language and its fucking disrespect,
If it made you feel angry, go ahead and write a letter,
But if you find me more offensive than the fucking possibility
The pope protected priests when they were getting fucking fiddly
Then listen to me motherfucker - this here is a fact,
You are just as morally misguided as that motherfucking,
Power-hungry, self-aggrandized bigot in the stupid fucking hat.
"""

val fuckThePope = new RudeSong(lyrics)
fuckThePope.cleanVersion
