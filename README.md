# dblib
## Step 1. 
Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://www.jitpack.io' }
		}
	}
## Step 2. 
Add the dependency

	dependencies {
	        implementation 'com.github.suntiago:dblib:v1.0-beta'
	}

## Step 3.
add the following code
```javascript
private void initKJDB() {
        KJDB.create(this, "yujia_carpro.db",
                false, DBUpdateHelper.DATABASE_VERSION, new DBUpdateHelper());
    }
    
    
    public void save() {
        if (KJDB.getDefaultInstance().findById(1, Entity.class) != null) {
            KJDB.getDefaultInstance().update(e);
            Toast.makeText(this, "update success", Toast.LENGTH_LONG).show();
        } else {
            KJDB.getDefaultInstance().save(e);
            Toast.makeText(this, "save success", Toast.LENGTH_LONG).show();
        }
    }

    public void query() {
        Entity et = KJDB.getDefaultInstance().findById(1, Entity.class);
        if (et != null) {

            Toast.makeText(this, "query success  " + et.getName(), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "not found", Toast.LENGTH_LONG).show();
        }
    }
```
